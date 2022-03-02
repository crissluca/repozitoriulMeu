package client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
	String ipServer;
	int portServer;
	
	public Client( String ipServer, int portServer )
	{
		this.ipServer = ipServer;
		this.portServer = portServer;
	}
	
	public void start() throws UnknownHostException, IOException
	{
		Socket s = new Socket( ipServer, portServer );
		
		OutputStream os = s.getOutputStream();
		
		
		os.write( 7 );		
		os.write( 13 );
	
	}

}
