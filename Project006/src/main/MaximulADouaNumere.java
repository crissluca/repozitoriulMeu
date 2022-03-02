package main;

import java.util.Scanner;

public class MaximulADouaNumere
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if( a < b )
		{
			System.out.println( b );
		}
		else
		{
			if( a > b )
			{
				System.out.println( a );
			}
			else
			{
				System.out.println( "egale" ); 
			}
		}

	}

}
