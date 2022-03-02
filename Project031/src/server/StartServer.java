package server;

import java.io.IOException;

public class StartServer
{
	public static final int portServer = 13001;
	
	public static void main(String[] args)
	{
		Server s = new Server( portServer );
		Server s2 = new Server( portServer );
		
		try
		{
			s.start();
		}
		catch( IOException ex )
		{
			System.out.println(ex);
		}
	}

}
