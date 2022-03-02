package main;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMe
{

	public static void main(String[] args)
	{
		int n = 4;
		
		Stack s = new Stack( n );
		
		s.push( 45 ); //put
		s.push( 44 ); //put
		
		//System.out.println(s.seek());
		
		s.pop();      //pop
		
		System.out.println(s.seek());
		
		
		
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		
		ArrayPrimitiv ap = new ArrayPrimitiv( n );
				
		int nr;
		for(int i=0;i<n;i++)
		{
			nr = sc.nextInt();
			
			ap.add( nr );
		}		
				
		System.out.println( ap );
		
		ap.sterge( 3 );
		
		System.out.println( ap );

	}

}
