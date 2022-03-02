package main;

import java.util.Scanner;

public class SiruriDeNumere
{
	int r;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner( System.in );
		
		//tipuri de date primitive : int double char long float byte
		int i, n;
		
		n = sc.nextInt();
				
		//structuri de date
		//array
		int v[];
		v = new int[n];

		
		//citire
		i=0;
		while( i < n )
		{	
			v[i] = sc.nextInt();

			i = i + 1;
		}
		

		//afisare
		for(i=0;i<n;i++)
		{
			System.out.print(v[i] + " ");			
		}
		System.out.println();

	}

}
