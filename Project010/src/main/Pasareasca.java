package main;

import java.util.Scanner;

public class Pasareasca
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String sir;
				
		sir = sc.nextLine();
		
		for(int i=0;i<sir.length();i++)
		{
			System.out.print( sir.charAt(i) );
			if( sir.charAt(i) == 'a' || sir.charAt(i) == 'e' || sir.charAt(i) == 'i' || sir.charAt(i) == 'o' || sir.charAt(i) == 'u' )
			{
				System.out.print("p");
				System.out.print( sir.charAt(i));
			}
		}
	}

}
