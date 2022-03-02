package main;

import java.util.Scanner;

public class ParseCNPCuFunctii
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
	
	public static void printNumber( int nr, int placeHolders)
	{
		int cate;
		
		int cnr;
		
		cate = 0;
		cnr = nr;
		while(cnr > 0)
		{
			//cifra = cnr % 10;
			
			cate = cate + 1;
			
			cnr = cnr / 10;
		}
		
		for(int i=0;i<placeHolders-cate; i++)
		{
			System.out.print(0);
		}
		System.out.println(nr);
	}
	
	private static void printTwoDecimals(int nr)
	{
		if(nr < 10)
		{
			System.out.print("0");
		}
		System.out.println( nr );
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
		
		printNumber(an, 2 );
		
		luna = Integer.parseInt( cnp.substring(3,5) );
		printTwoDecimals( luna );
		
		zi = extractDay ( cnp );
		printTwoDecimals( zi );			
		
		nrDinAn = Integer.parseInt( cnp.substring( 7 ) );
		
		printNumber(nrDinAn, 6 );
	}


}
