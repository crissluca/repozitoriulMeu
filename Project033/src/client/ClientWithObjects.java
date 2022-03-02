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
	
	String userName;
	
	public ObjectOutputStream oos;
	
	ClientServerHandler csh;
	
	public ClientWithObjects( String ipServer, int portServer, String userName )
	{
		this.ipServer = ipServer;
		this.portServer = portServer;
		
		this.userName = userName;
	}
	
	public void start() throws UnknownHostException, IOException
	{
		Socket s = new Socket( ipServer, portServer );

		OutputStream os = s.getOutputStream();
		
		oos = new ObjectOutputStream( os );
		
		try
		{
			oos.writeObject( "Hello" );
		
			oos.writeObject( userName );
			
			csh = new ClientServerHandler(s, userName);
			csh.start();
		}
		catch(Exception ex)
		{
			System.out.println( ex );
		}
		
		System.out.println(userName + " is now connected to the chat ...");
	}

	public void run()
	{
		Scanner sc = new Scanner(System.in);
		
		String to;
		String err;
		String command = "";
		String message;
		String line;
		
		while( !command.equals(":quit") )
		{
			
			command = "";
			to      = "";
			message = "";
			err     = "";
			
			System.out.print(">");
			
			line = sc.nextLine();	
			
			if( line.startsWith(":") )
			{
				if(line.indexOf(" ") >-1 )
				{
					to = line.substring(1, line.indexOf(" "));
					if(to.indexOf(":") > -1)
					{
						to = to.substring( to.indexOf(":")+1 );
					}
					else
					{
						err = "To send a message to someone particular use this format :To:UserName Message";
					}
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
			
			if( !err.isEmpty() )
			{
				System.out.println("\n>" + err);
			}
		}
	}
}
