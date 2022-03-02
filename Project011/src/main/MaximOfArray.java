package main;

import java.util.Scanner;

public class MaximOfArray
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		
		int v[];
		
		n = sc.nextInt();
		
		v = new int[n];
		
		for(i=0;i<n;i++)
		{
			v[i] = sc.nextInt();
		}
		
		int maxim = -2147483648;
		for(i=0;i<n;i++)
		{
			if( v[i] > maxim)
			{
				maxim = v[i];
			}
		}
		
		System.out.println(maxim);

	}

}
