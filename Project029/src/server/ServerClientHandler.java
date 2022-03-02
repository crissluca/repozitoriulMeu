package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerClientHandler
{
	Socket clientSocket;
	InputStream is;
	ObjectInputStream ois;
	
	String userName;
	
	public ServerClientHandler(Socket clientSocket) throws IOException
	{
		this.clientSocket = clientSocket;
		//clientSocket.setKeepAlive( true );
		//clientSocket.setSoTimeout( 10000 );
		
		is = clientSocket.getInputStream();
		
		
		ois = new ObjectInputStream( is );
	}
	
	public void handlePrimitives() throws IOException
	{
		
		
		int numar = is.read();
		
		System.out.println("Received " + numar);
		
		boolean correctCommand = false;
		
		if( numar == 7 )
		{
			System.out.println("Calculam ridicarea la putere");
			int x = is.read();
			System.out.println( x*x );
			
			correctCommand = true;
		}
		
		if(!correctCommand)
		{
			System.out.println("Unknown command");
		}
	}
	
	public void handleObjects() throws IOException
	{			
		Object obj = null;
			
		try
		{			
			obj = ois.readObject();
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("I have received an object of a class that I don't know");
		}
		
		
		boolean correctCommand = false;
		
		if( obj instanceof String && "Hello".equals((String)obj))
		{
			correctCommand = true;	
			
			try
			{
				obj = ois.readObject();
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("I have received an object of a class that I don't know");
			}
			
			userName = (String) obj;
			
			System.out.println("Hello " + userName );
			
//			if( obj instanceof Integer )
//			{
//				System.out.println("Calculam ridicarea la putere");
//				int x = is.read();
//				System.out.println( x*x );
//			
//				correctCommand = true;			
//			}
		}
		
		if(!correctCommand)
		{
			System.out.println("Unknown command");
		}
	}
	
	public void handleObjectsToDetailed() throws IOException
	{			
		Object obj = null;
		boolean gotObject = false;
		while( !gotObject)
		{
			gotObject = true;
			
			try
			{			
				obj = ois.readObject();
			}
			catch(IOException ioe)
			{
				gotObject = false;
				
				System.out.println("Connection got reset. Trying to recconect");
				
				if(clientSocket.isConnected())
				{					
					System.out.println("The connection is still up");
					
					is = clientSocket.getInputStream();
				
					ois = new ObjectInputStream( is );
				}
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("I have received an object of a class that I don't know");
				gotObject = false;
			}
		}
		
		boolean correctCommand = false;
		
		if( obj instanceof String && "Hello".equals((String)obj))
		{
			
			correctCommand = true;	
			
			try
			{
				obj = ois.readObject();
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("I have received an object of a class that I don't know");
			}
			
			System.out.println("Hello " + (String) obj );
			
//			if( obj instanceof Integer )
//			{
//				System.out.println("Calculam ridicarea la putere");
//				int x = is.read();
//				System.out.println( x*x );
//			
//				correctCommand = true;			
//			}
		}
		
		if(!correctCommand)
		{
			System.out.println("Unknown command");
		}
	}
}
