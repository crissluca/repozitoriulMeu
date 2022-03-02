package main;

import java.util.Scanner;

public class CatiDeZece
{

	public static void main(String[] args)
	{
		int a=0,b=0;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		//xx0 ..  a  .. .. b
		int deDupaA = a + 10 - (a % 10 );
		int deDinainteaLuiB = (b / 10 ) * 10;
		
		int cate = deDinainteaLuiB / 10 - deDupaA / 10 + 1;
		System.out.println( cate ); 	
		
		
	}

}
