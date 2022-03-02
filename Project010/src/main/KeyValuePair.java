package main;

import java.util.Scanner;

public class KeyValuePair
{

	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		
		String sir;
				
		sir = sc.nextLine();
		
		String separator = "=";
		
		String key="";
		String value="";
		
		if( sir.indexOf(separator) > -1)
		{
			value = sir.substring( sir.indexOf(separator) + separator.length() );
			
			value = value.trim();
			
			key = sir.substring( 0, sir.indexOf(separator) );
		}
		
		System.out.println("Cheia este : " + key);
		System.out.println("Valoarea este : >" + value +"<");

	}

}
