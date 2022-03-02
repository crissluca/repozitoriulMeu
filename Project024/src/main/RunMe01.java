package main;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMe01
{
	@Deprecated
	public double putere(double x)
	{
		return x * x;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		//primitv
		int a = 4;
		
		//Obiect
		Integer b = a;
		

		//array
		int n;
		
		n = sc.nextInt();
		
		int v[] = new int[n];
		for(int i=0;i<n;i++)
		{
			v[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			System.out.print( v[i] + " ");
		}
		System.out.println();
		
		v = null;
		
		
		//Collections
		ArrayList al = new ArrayList();
		
		n = sc.nextInt();
		int nr;
		for(int i=0;i<n;i++)
		{
			nr = sc.nextInt();
			
			al.add( nr );
		}		
		
		for(int i=0;i<n;i++)
		{
			System.out.print( al.get(i) + " ");
		}
		System.out.println();
		
		al.clear();
		
		//declarare
		int d;
		
		//initializare : adica prima atribuire a unei valori 
		d = 4;
		
		//declarare si initializare
		int r = 4;
		
	}

}
