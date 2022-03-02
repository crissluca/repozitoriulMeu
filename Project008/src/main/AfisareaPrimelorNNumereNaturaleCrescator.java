package main;

import java.util.Scanner;

public class AfisareaPrimelorNNumereNaturaleCrescator
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
			System.out.print( i + " " );
			
			i = i + 1;
		}

	}

}
