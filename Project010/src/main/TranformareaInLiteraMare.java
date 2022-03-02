package main;

import java.util.Scanner;

public class TranformareaInLiteraMare
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
				if( (sir.charAt(i) >= 'a' && sir.charAt(i) <= 'z') || (sir.charAt(i) >= 'A' && sir.charAt(i) <= 'Z') )
				{
					inCuvant = true;
					
					if( sir.charAt(i) >= 'a' && sir.charAt(i) <= 'z' )
					{						
						System.out.print( (char) (sir.charAt(i) - 32) );
					}
					else
					{
						System.out.print( sir.charAt(i) );
					}
				}
				else 
				{
					System.out.print( sir.charAt(i) );
				}
			}
			else
			{
				if(  sir.charAt(i) == ' ' || sir.charAt(i) == '.' || sir.charAt(i) == ',' || sir.charAt(i) == '!' || sir.charAt(i) == '?')
				{
					inCuvant = false;								
				}
				
				System.out.print( sir.charAt(i) );
			}
		}
	}
}
