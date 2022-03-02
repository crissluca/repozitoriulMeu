package main;

import java.util.Scanner;

public class PareConsecutiveMiaMiciDecatN
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner( System.in);
		
		int i;
		int n;
		
		n = sc.nextInt();
		
		i = 0;
		while(i<n)
		{
			if( (1+i) % 2 == 0)
			{
				System.out.print( (1 + i) + " ");
			}
			
			i = i + 1;
		}


	}

}
