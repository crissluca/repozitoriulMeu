package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientWithObjects
{
	String ipServer;
	int portServer;
	
	public ObjectOutputStream oos;
	
	public ClientWithObjects( String ipServer, int portServer )
	{
		this.ipServer = ipServer;
		this.portServer = portServer;
	}
	
	public void start() throws UnknownHostException, IOException
	{
		Socket s = new Socket( ipServer, portServer );

		OutputStream os = s.getOutputStream();
		
		oos = new ObjectOutputStream( os );
		
		try
		{
			oos.writeObject( "Hello" );
		
			oos.writeObject( "Mihai" );
		}
		catch(Exception ex)
		{
			System.out.println( ex );
		}
		
		System.out.println("Connect is up and running ...");
	}

	public void run()
	{
		Scanner sc = new Scanner(System.in);
		
		String to;
		String command = "";
		String message;
		String line;
		
		while( !command.equals(":quit") )
		{
			command = "";
			to      = "";
			message = "";
			
			System.out.print(">");
			
			line = sc.nextLine();	
			
			if( line.startsWith(":") )
			{
				if(line.indexOf(" ") >-1 )
				{
					to = line.substring(0, line.indexOf(" "));
					message = line.substring( line.indexOf(" ")+1);
				}
				else
				{
					command = line;
				}
			}
			else
			{
				to = "all";
				message = line;
			}
			
			if( !to.isEmpty() )
			{
				try
				{
					oos.writeObject( "To:" + to );
				
					oos.writeObject( message );
				}
				catch(Exception ex)
				{
					System.out.println( ex );
				}
			}
		}
	}
}
