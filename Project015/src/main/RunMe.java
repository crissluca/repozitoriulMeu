package main;

import java.util.Scanner;

public class RunMe
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int op = -1;
		
		while( op != 5)
		{
			System.out.println("1. Adunarea a doua");
			System.out.println("2. Substraction");
			System.out.println("5. Exit");
			
			op = sc.nextInt();
			
			
			if( op == 1)
			{
				
				int numarator;
				int numitor;
								
				System.out.println("Introduceti prima fractie : ");
				numarator = sc.nextInt();
				numitor = sc.nextInt();
				
				Fraction f1 = new Fraction(numarator, numitor);
				
				System.out.println("Introduceti a doua fractie : ");
				numarator = sc.nextInt();
				numitor = sc.nextInt();
				
				Fraction f2 = new Fraction(numarator, numitor);
				System.out.println("Adun " + f1 + " cu "+ f2 + " : " + f1.addition(f2));
				
			}
			if( op == 2)
			{
				
			}
			if( op == 3)
			{
				
			}
			if( op == 4)
			{
				
			}
			
			
			
		}

	}

}
