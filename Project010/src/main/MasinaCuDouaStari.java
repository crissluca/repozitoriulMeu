package main;

import java.util.Scanner;

public class MasinaCuDouaStari
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String sir;
				
		sir = sc.nextLine();
		
		boolean inCuvant = false;
		
		for(int i=0;i<sir.length();i++)
		{			
			if( inCuvant == false )
			{
				if( sir.charAt(i) >= 'a' && sir.charAt(i) <= 'z')
				{
					inCuvant = true;
				}
			}
			else
			{
				if(  sir.charAt(i) == ' ' || sir.charAt(i) == '.' || sir.charAt(i) == ',' || sir.charAt(i) == '!' || sir.charAt(i) == '?')
				{
					inCuvant = false;
					
					System.out.println();
				}
			}
			
			if(inCuvant == true )
			{
				System.out.print(sir.charAt(i) );
			}
			
		}

	}

}
