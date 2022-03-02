package main;

import java.util.Scanner;

public class Palindrom
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String sir;
				
		sir = sc.nextLine();
		
		boolean palindrom = true;
		
		int n = sir.length();
		
		for(int i=0;i<n/2;i++)
		{
			if( sir.charAt(i) != sir.charAt( n-1-i ))
			{
				palindrom = false;
			}
		}
		
		if( palindrom == true)
		{
			System.out.println("DA");
		}
		else
		{
			System.out.println("NU");
		}

	}

}
