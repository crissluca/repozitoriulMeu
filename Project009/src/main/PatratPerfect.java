package main;

import java.util.Scanner;

public class PatratPerfect
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		System.out.print("Patrat perfect : ");
		
		//deoarce 4.0 == 4 este true
		if ( Math.sqrt(a) == (long)Math.sqrt(a) )
		{
			System.out.println("da");			
		}
		else
		{
			System.out.println("nu");			
		}
		

	}
}
