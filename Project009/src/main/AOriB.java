package main;

import java.util.Scanner;

public class AOriB
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		int a,b;
		
		long suma;
		
		a = sc.nextInt();				
		b = sc.nextInt();
		
		suma = 0;
		
		n = a;
		
		i = 0;
		while( i < n ) 
		{
			suma = suma + b;
			
			i = i + 1;
		}
		
		System.out.println( "a * b = "+ suma);

	}

}
