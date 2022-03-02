package main;

import java.util.Scanner;

public class SumaNumerelorCitite
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner( System.in );
		
		int i, n;
		
		int nr;
		
		long suma;
		
		n = sc.nextInt();
		
		suma = 0;
		i=0;
		while( i < n )
		{
			nr = sc.nextInt();
			
			
			suma = suma + nr;
			
			i = i + 1;
		}
		
		System.out.println( suma );

	}

}
