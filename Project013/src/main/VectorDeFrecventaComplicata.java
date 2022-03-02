package main;

import java.util.Random;
import java.util.Scanner;

public class VectorDeFrecventaComplicata
{
	static int largestNumber = 100;
	
	static int n = 5;
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
		
//		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = 1;
//		}
		
		for(int i=0;i<n;i++)
		{
			arr[i] = rand.nextInt( largestNumber+1 );
			if( rand.nextInt( 1000 ) % 2 == 1)
			{				
				arr[i] = -arr[i];
			}
		}
		
		printVector( arr );
		
		vf = new int[2*largestNumber+1];
//vectorul de frecventa trebuie initalizat cu 0
//		for(int i=0;i<n;i++)
//		{
//			vf[ i ] = 0;
//		}
		for(int i=0;i<n;i++)
		{
			vf[ largestNumber + arr[i] ] = vf[ largestNumber + arr[i] ] + 1;  //vf[ arr[i] ] ++   incrementare
		}
		
		printVector( vf );
		
		for(int numarInIntervalDecalat=0; numarInIntervalDecalat<2*largestNumber+1; numarInIntervalDecalat++)
		{
			if( vf[ numarInIntervalDecalat ] == 1 ) //ce se afla pe pozitia i este 1 ?
			{
				System.out.print( (numarInIntervalDecalat - largestNumber) + " " );
			}
		}
		System.out.println();
	}

}
