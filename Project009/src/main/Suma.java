package main;

import java.util.Scanner;

public class Suma
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		long suma;
		
		n = sc.nextInt();				
		
		suma = 0;
		i = 0;
		while( i < n ) 
		{
			suma = suma + i;
			
			i = i + 1;
		}
		
		System.out.println(suma);

	}

}
