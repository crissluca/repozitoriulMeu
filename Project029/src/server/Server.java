package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	//String ip;
	int port;
	
	ServerSocket ss;
	
	Socket s[];
	
	public Server(int port)
	{
		this.port = port;
		
		s = new Socket[10];
	}
	
	public void start() throws IOException
	{			
		ss = new ServerSocket(port);
		
		
		Socket s = ss.accept();
		
		System.out.println("Someone connected"); // from " + s.getInetAddress() + " : " + s.getPort() );
		
		ServerClientHandler sch = new ServerClientHandler( s );
		sch.handleObjects();
		
		
	}
	
}
