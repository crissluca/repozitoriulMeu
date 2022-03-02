package main;

import java.util.Scanner;

public class Practice03Part01of02Task03
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		int a,b,c;
		
		int op;
		
		int maxim;
		int minim;
		
		double mean;
		
		System.out.println("Please enter three numbers : "); 
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("Please enter the corresponding number of the opperation you desire : ");
		System.out.println("1. maxim");
		System.out.println("2. minim");
		System.out.println("3. mean");
		
		op = sc.nextInt();
		
		if( op == 1)
		{
			if( a < b )
			{
				if ( b < c ) // a < b < c   1 2 3
				{
					maxim = c;
				}
				else // a < b > c    1 3 2
				{
					maxim = b;
				}
			}
			else //a > b
			{
				if ( b > c ) //a > b > c   3 2 1
				{
					maxim = a;
				}
				else //a > b < c   3 1 2
				{
					if( a > c ) // 3 1 2
					{
						maxim = a;
					}
					else // 2 1 3
					{
						maxim = c;
					}
				}
			}
			
			System.out.println( maxim );
			
		}
		else
		{
			if( op == 2)
			{
				
			}
			else
			{
				if( op == 3)
				{
					mean = (double) ( a + b + c) / 3;
					System.out.println( mean );
				}
				else
				{
					System.out.println("Invalid option");
				}
			}
		}
		
		

	}

}

