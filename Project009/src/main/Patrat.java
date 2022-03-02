package main;

import java.util.Scanner;

public class Patrat
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i, j, n;
		
		n = sc.nextInt();
		
		i = 0;
		while (i < n )
		{
			
			j = 0;
			while( j < n )
			{
				
				System.out.print("*");
				
				j = j + 1;
			}
			System.out.println();
			
			
			i = i +1;
		}
		
	}

}
