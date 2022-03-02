package main;

import java.util.Scanner;

public class AfisareInInterval
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner( System.in);
		
		int i;
		int n;
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		n = b - a + 1;
				
		i = 0;
		while( i < n )
		{
			System.out.print( (a + i) + " " );
			
			i = i + 1;
		}

	}

}
