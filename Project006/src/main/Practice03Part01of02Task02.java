package main;

import java.util.Scanner;

public class Practice03Part01of02Task02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		int a,b,c;
		
		int op;
		
		long suma;
		long prod;
		
		System.out.println("Please enter three numbers : "); 
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("Please enter the corresponding number of the opperation you desire : ");
		System.out.println("1. for sum");
		System.out.println("2. for prod");
		
		op = sc.nextInt();
		
		if( op == 1)
		{
			suma = a + b + c;
			System.out.println(suma);
		}
		else
		{
			if( op == 2)
			{
				prod = a * b * c;
				System.out.println(prod);
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		
		

	}

}
