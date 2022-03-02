package client;

import java.net.ConnectException;

public class StartClient
{

	public static final String ipServer = "localhost"; //"136.255.226.122";
	public static final int portServer = 13001;
	
	public static void main(String[] args)
	{
		Client c = new Client( ipServer, portServer );
		
		try
		{
			c.start();
		}
		catch(ConnectException ce)
		{
			System.out.println("The server "+ ipServer + ":" + portServer + " is not reachable.");
		}
		catch(Exception ex)
		{
			System.out.println("Error starting client : " + ex);
		}
	}

}
