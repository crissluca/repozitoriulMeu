package main;

import java.util.Scanner;

public class ParseCNPcuFor
{
	static int sex;
	
	static int an;
	static int luna;
	static int zi;
	
	static  int nrDinAn;
	
	public static int extractDay( String cnp )
	{
		int numarul;
		
		numarul = 0;
		
		numarul = numarul * 10 + (cnp.charAt(5)-48);
		
		numarul = numarul * 10 + (cnp.charAt(6)-48);
		
		return numarul;
	}
	
	public static void main(String[] args)
	{
		//char arr[];
		//arr = new char[13];
		
		
		String cnp;
		
		Scanner sc = new Scanner(System.in);
		
		cnp = sc.next();
		
		for(int i=0;i<cnp.length();i++)
		{				
			if(i == 0)
			{
				sex = cnp.charAt(i) - 48;  //<=> arr[0]

				System.out.println(sex);
			}
				
			if(i == 1)
			{
				an = Integer.parseInt ("" + cnp.charAt(i) + cnp.charAt(i+1)) ;
		
				System.out.println(an);
			}
		
			if(i == 3)
			{
				luna = Integer.parseInt( cnp.substring(i,i+2) );
		
				System.out.println(luna);
			}
			
			if( i == 5)
			{
				zi = extractDay ( cnp );
			
		
				System.out.println(zi);
			}
		
			if(i == 7)
			{
				nrDinAn = Integer.parseInt( cnp.substring( i ) );			
		
				System.out.println( nrDinAn );
			}
			
		}
	}

}
