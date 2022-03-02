package main;

import java.util.Random;

public class SortareBubble
{
	static int largestNumber = 10;
	
	static int n = 20;
	static int arr[];
	
	public static void printVector(int unVector[])
	{
		int n = unVector.length;
		for(int i=0;i<n;i++)
		{
			System.out.print( unVector[i] + " " );
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		arr = new int[n];

		Random rand = new Random();
				
		for(int i=0;i<n;i++)
		{
			arr[i] = rand.nextInt( largestNumber+1 );
		}
		
		printVector( arr );
		
		//sortare crescatoare >
		//sortare descrescatoare <
		
		boolean gata = false;
		while(!gata)
		{
			gata = true;
			for(int i=0;i<n-1;i++)
			{
				if( arr[i] > arr[ i+1 ]) 
				{
					int aux = arr[i];
					arr[i]  = arr[i+1];
					arr[i+1]  = aux;
					
					gata = false;
				}
			}
		}
		
		printVector( arr );


	}

}
