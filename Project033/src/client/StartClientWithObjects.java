package client;

import java.io.IOException;
import java.net.ConnectException;

public class StartClientWithObjects
{

	public static final String ipServer = "localhost"; //"136.255.226.122";
	public static final int portServer = 13001;
	
	public static void main(String[] args)
	{
		String userName = "anonymous";
		if(args.length == 1)
		{
			userName = args[0];
		}
		ClientWithObjects c = new ClientWithObjects( ipServer, portServer, userName );
		
		try
		{
			c.start();
			c.run();
		}
		catch(ConnectException ce)
		{
			System.out.println("The server "+ ipServer + ":" + portServer + " is not reachable.");
		}
		catch(Exception ex)
		{
			System.out.println("Error starting client : " + ex);
		}
		finally
		{
			try
			{
				c.oos.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Client ended the connection");
		}
	}

}
