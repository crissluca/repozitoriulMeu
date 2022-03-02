package main;

import java.util.Scanner;

public class NNumereAmbelePeRanduriDiferite
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner( System.in);
		
		int i;
		int n;
		
		n = sc.nextInt();
		
		i = 0;
		while( i < n )
		{
			System.out.print( ( 1 + i) + " " );
			
			i = i + 1;
		}
		//aici i == n
		System.out.println();
		
		i=0;
		while(i<n)
		{
			
			System.out.print( (n - i) + " ");
			
			i = i + 1;
		}
		


	}

}
