package client;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class ClientServerHandler extends Thread
{
	Socket clientSocket;
	
	InputStream is;
	ObjectInputStream ois;
	
	String userName;
	
	public ClientServerHandler(Socket clientSocket, String userName) throws IOException
	{
		this.userName = userName;
		
		this.clientSocket = clientSocket;
		
		is = clientSocket.getInputStream();
				
		ois = new ObjectInputStream( is );
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
		
		if( obj instanceof String && ((String)obj).startsWith("From:"))
		{
			correctCommand = true;
			
			String from = (String)obj;
			from = from.substring(5);
			
			try
			{
				obj = ois.readObject();
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("I have received an object of a class that I don't know");
			}
			
			 
			String message = (String) obj;
			
			System.out.println(message + " From:" + from);
			System.out.println(">");
		}
		
		if(!correctCommand)
		{
			System.out.println(userName + " : " + "Unknown command : " + (String)obj);
		}
	}
	
	@Override
	public void run()
	{
		boolean serverConnected = true;
		while( serverConnected )
		{
			try
			{
				handleObjects();
			} 
			catch(SocketException se)
			{	
				if( !"Connection reset".equals(se.getMessage()))
				{
					System.out.println("Exception : " + se);
				}
				serverConnected = false;
			}
			catch(EOFException e)
			{
				serverConnected = false;
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("\nLost connection to server");
		System.exit(0);
	}
}
