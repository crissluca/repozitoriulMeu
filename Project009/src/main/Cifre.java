package main;

import java.util.Scanner;

public class Cifre
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a;
		int ca;
		
		int cifra;
		
		a = sc.nextInt();
		
		ca = a;
		
		cifra = ca % 10;
		System.out.println(cifra);
		ca = ca / 10;
		
		cifra = ca % 10;
		System.out.println(cifra);
		ca = ca / 10;
		
		cifra = ca % 10;
		System.out.println(cifra);
		ca = ca / 10;
		
		cifra = ca % 10;
		System.out.println(cifra);
		ca = ca / 10;
		
		
		{
			int c;
			
			c = 10;
			
			System.out.println(c);
		}
		
			
		ca = a;
		while( ca != 0 )
		{
			cifra = ca % 10;
			
			System.out.println( cifra );
			
			ca = ca / 10;
		}

	}

}
