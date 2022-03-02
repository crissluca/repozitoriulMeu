package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientWithObjects
{
	String ipServer;
	int portServer;
	
	public ClientWithObjects( String ipServer, int portServer )
	{
		this.ipServer = ipServer;
		this.portServer = portServer;
	}
	
	public void start() throws UnknownHostException, IOException
	{
		Socket s = new Socket( ipServer, portServer );

		OutputStream os = s.getOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream( os );
		
		try
		{
			oos.writeObject( "Hello" );
		
			oos.writeObject( "Mihai" );
			
			Thread.sleep( 100 );
		}
		catch(Exception ex)
		{
			System.out.println( ex );
		}
		
		s.close();
		System.out.println("Client ended the connection");
	}

}
