package main;

import java.util.Random;
import java.util.Scanner;

public class VectorDeFrecventaSimplificata
{
	static int largestNumber = 10;
	
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
		}
		
		printVector( arr );
		
		vf = new int[largestNumber+1];
//vectorul de frecventa trebuie initalizat cu 0
//		for(int i=0;i<n;i++)
//		{
//			vf[ i ] = 0;
//		}
		for(int i=0;i<n;i++)
		{
			vf[ arr[i] ] = vf[ arr[i] ] + 1;  //vf[ arr[i] ] ++   incrementare
		}
		
		printVector( vf );
		
		for(int numarInInterval=0;numarInInterval<largestNumber+1;numarInInterval++)
		{
			if( vf[numarInInterval] == 1 ) //ce se afla pe pozitia i este 1 ?
			{
				System.out.print( numarInInterval + " " );
			}
		}
		System.out.println();
	}

}
