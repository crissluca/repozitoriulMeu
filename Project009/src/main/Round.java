package main;

import java.util.Scanner;

public class Round
{
	public static void main(String[] args)
	{
		double a = 3.1415;
		double b = 3.65;
		
		
		System.out.println("Original a: " + a);
		System.out.println("Original b: " + b);
		System.out.println();
		
		//round as floor
		System.out.println( "Round a  : " + Math.round(a));
		System.out.println( "Eu cred  : 3\n" );
		
		//round as ceil
		System.out.println( "Round b  : " + Math.round(b));
		System.out.println( "Eu cred  : 4\n" );
		
		//truncate (floor)
		System.out.println( "Truncate : " + (int)a );
		System.out.println( "Eu cred  : 3\n" );
		
		//floor
		System.out.println( "Floor a  : " + Math.floor(a));
		System.out.println( "Eu cred  : 3.0\n" );
		
		//floor
		System.out.println( "Floor b  : " + Math.floor(b));
		System.out.println( "Eu cred  : 3.0\n" );
		
		//ceil
		System.out.println( "Ceil     : " + Math.ceil(a));
		System.out.println( "Eu cred  : 4.0\n" );

	}
}
