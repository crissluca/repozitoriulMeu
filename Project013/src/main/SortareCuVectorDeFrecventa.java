package main;

import java.util.Random;
import java.util.Scanner;

public class SortareCuVectorDeFrecventa
{
	static int largestNumber = 100;
	
	static int n = 20;
	static int arr[];
	
	static int vf[];
	
	
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
		
		vf = new int[largestNumber+1];
		for(int i=0;i<n;i++)
		{
			vf[ arr[i] ] = vf[ arr[i] ] + 1; 
		}
		
		printVector( vf );
		
		for(int numarInInterval=0;numarInInterval<largestNumber+1;numarInInterval++)
		{
			int nrAparitii = vf[ numarInInterval];
			
			int j =0;
			while( j< nrAparitii )
			{
				System.out.print( numarInInterval + " " );
				
				j++;
			}
		}
		System.out.println();
	}

}
