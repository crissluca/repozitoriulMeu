package main;

import java.util.Scanner;

public class Rama
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i, j, n;
		
		n = sc.nextInt();
		
		i=0;
		while(i<n)
		{
			System.out.print("s");
			
			i = i + 1;
		}
		System.out.println();
		
		i = 0;
		while (i < n )
		{
			System.out.print("s");
			
			j = 0;
			while( j < n-1-1)
			{
				System.out.print(" ");
				
				j = j + 1;
			}
			
			System.out.print("d");
			
			System.out.println();

			i = i +1;
		}
		
		i=0;
		while(i<n)
		{
			System.out.print("j");
			
			i = i + 1;
		}
		
	}

}
