package main;

import java.util.Scanner;

public class ParseCNP
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
		
		sex = cnp.charAt(0) - 48;  //<=> arr[0]

		System.out.println(sex);
		
		
		//pentru fiecare primitiva ezista o clasa Wrapper
		//int -> Integer
		//char -> Character
		//double -> Double
		
		an = Integer.parseInt ("" + cnp.charAt(1) + cnp.charAt(2)) ;
		
		System.out.println(an);
		
		luna = Integer.parseInt( cnp.substring(3,5) );
		
		System.out.println(luna);
		
		zi = extractDay ( cnp );
		
		System.out.println(zi);
		
		nrDinAn = Integer.parseInt( cnp.substring( 7 ) );
		
		System.out.println( nrDinAn );
	}

}
