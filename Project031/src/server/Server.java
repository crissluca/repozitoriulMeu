package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	int port;
	
	ServerSocket ss;
	
	Socket s[];
	
	int maxNumberOfConnections = 10;
	
	public static int noOfClients = 0;
	
	public Server(int port)
	{
		this.port = port;
		
		s = new Socket[maxNumberOfConnections]; 
	}
	
	public void start() throws IOException
	{			
		ss = new ServerSocket( port );
		
		
		System.out.println("Server started on port " + port);
		while( true )
		{				
			Socket s = ss.accept();
			
			if( noOfClients < maxNumberOfConnections)
			{
			
				ServerClientHandler sch = new ServerClientHandler( s , 1 + noOfClients );
				sch.start();
				
				noOfClients ++;
			}
			else
			{
				System.out.println("We reached the maximum number of connections");
			}
			
		}
		
	}
	
}
