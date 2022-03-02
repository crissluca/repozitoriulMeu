package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RunMe
{
	public static void main( String args[] )
	{
		String value3;
		System.out.println("Parameters : ");
		for(int i=0;i<args.length;i++)
		{
			System.out.print("	" + args[i]);
			if(i==2)
			{
				if(args[i].indexOf("=") > -1)
				{
					value3 = args[i].substring( args[i].indexOf("=") +1 );
					System.out.print(" extracted value : " + value3);
				}
				else
				{
					System.out.println("\n\nInvalid third argument");
					System.exit(0);
				}
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		String username, password;
		
		HashMap credentials = new HashMap();
		
		int op =0;
		
		while( op != 7)
		{	
			System.out.println("1. Add a new user;");
			System.out.println("2. Delete a user;");
			System.out.println("3. Check if the user exists;");
			System.out.println("4. Change the username of a user;");
			System.out.println("5. Change the password of a user.");
			System.out.println("6. Show all.");
			System.out.println("7. Exit.");
			
			op = sc.nextInt();
			sc.nextLine();
			
			if(op == 1)
			{
				username = sc.nextLine();
				password = sc.nextLine();
				
				credentials.put( username, password);
			}
			if(op == 2)
			{
				username = sc.nextLine();
				if( credentials.get( username ) == null)
				{
					System.out.println(username + " not found among credentials");
				}
				else
				{
					credentials.remove( username );
				}
				
			}
			if(op == 3)
			{
				username = sc.nextLine();
				
				if( credentials.get( username ) == null)
				{
					System.out.println(username + " not found among credentials");
				}
			}
			if(op == 4)
			{
				System.out.println("Enter the username you want to change : ");
				username = sc.nextLine();
				if( credentials.get( username ) == null)
				{
					System.out.println(username + " not found among credentials");
				}
				else
				{
					password = (String) credentials.get( username );
					credentials.remove( username );
					
					
					System.out.println("Enter the new user name : ");
					username = sc.nextLine();
					
					credentials.put( username, password);
				}
			}
			if(op == 5)
			{
				System.out.println("Enter the username you want to ammend");
				username = sc.nextLine();
								
				if( credentials.get( username ) == null)
				{
					System.out.println(username + " not found among credentials");
				}
				else
				{
					System.out.println("Enter the new password");
					password = sc.nextLine();
					
					credentials.put( username, password);
				}
			}
			if(op == 6)
			{
				//System.out.println( credentials.toString() );
				
				Set s = credentials.keySet();
				
				for( Object key : s )
				{
					System.out.println( (String) key + " -> " + credentials.get(key) );
				}
			}
		}
	}
}

