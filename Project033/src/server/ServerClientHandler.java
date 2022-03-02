package server;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class ServerClientHandler extends Thread
{
	Socket clientSocket;
	
	InputStream is;
	ObjectInputStream ois;
	
	OutputStream os;
	ObjectOutputStream oos;
	
	Server server;
	
	String userName;
	
	int id;
	
	public ServerClientHandler(Server server, Socket clientSocket, int id) throws IOException
	{
		this.server = server;
		
		this.clientSocket = clientSocket;
		//clientSocket.setKeepAlive( true );
		//clientSocket.setSoTimeout( 10000 );
		
		is = clientSocket.getInputStream();
				
		ois = new ObjectInputStream( is );
		
		
		os = clientSocket.getOutputStream();
		
		oos = new ObjectOutputStream( os );
		
		this.id = id;
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
	
	public void handleObjects() throws EOFException, IOException
	{			
		Object obj = null;
			
		try
		{			
			obj = ois.readObject();
		}
		catch(SocketException se)
		{
			throw se;
		}
		catch(EOFException ex)
		{
			throw ex;
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
			
			System.out.println(userName + " connected with id " + id);
			
		}
		
		if( obj instanceof String && ((String)obj).startsWith("To:"))
		{
			correctCommand = true;
			
			String to = (String)obj;
			to = to.substring(3);
			
			try
			{
				obj = ois.readObject();
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("I have received an object of a class that I don't know");
			}
			
			 
			String message = (String) obj;
			
			System.out.println(userName + " : " + message + " to:" + to);
			
			server.sendMessageTo( message, userName, to);
			
		}
		
		if(!correctCommand)
		{
			System.out.println(userName + " : " + "Unknown command : " + (String)obj);
		}
	}
	
	public void sendMessage(String message, String from)
	{
		try
		{
			oos.writeObject( "From:" + from );
			oos.writeObject( message );
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
	
	@Override
	public void run()
	{
		boolean clientConnected = true;
		while( clientConnected )
		{
			try
			{
				handleObjects();
			} 
			catch(SocketException se)
			{	
				System.out.println("Exception : " + se);
				clientConnected = false;
			}
			catch(EOFException e)
			{
				clientConnected = false;
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		Server.noOfClients --;
		
		System.out.println(userName + " disconected form the chat");
	}
}
