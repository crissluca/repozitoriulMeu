package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	int port;
	
	ServerSocket ss;
	
	ServerClientHandler clientHandlers[];
	
	int maxNumberOfConnections = 10;
	
	public static int noOfClients = 0;
	
	public Server(int port)
	{
		this.port = port;
		
		clientHandlers = new ServerClientHandler[maxNumberOfConnections];
	}
	
	public void serve() throws IOException
	{			
		ss = new ServerSocket( port );
		
		
		System.out.println("Server started on port " + port);
		while( true )
		{				
			Socket s = ss.accept();
			
			if( noOfClients < maxNumberOfConnections)
			{
			
				ServerClientHandler sch = new ServerClientHandler( this, s , 1 + noOfClients );
				sch.start();	
				
				clientHandlers[ noOfClients ++ ] = sch;
			}
			else
			{
				System.out.println("We reached the maximum number of connections");
			}
			
		}
	}
	
	
	public void sendMessageTo( String message, String from, String to)
	{	
		ServerClientHandler sch = null;
		
		for(int i=0;i<noOfClients && sch==null;i++)
		{
			
			if( clientHandlers[i].userName.equals( to ) )
			{
				sch = clientHandlers[i];
			}
		}
		
		
		if(sch != null)
		{
			sch.sendMessage( message , from );
		}
		else
		{
			System.out.println(from + " trys to send a message to an unconnected user " + to);
		}
		
	}
}
