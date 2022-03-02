package main;

import java.util.Scanner;

public class Zodia01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int ziua, luna, anul;
		
		System.out.println("Introduceti data nasterii sub forma Zi Luna An");

		ziua = sc.nextInt();
		luna = sc.nextInt();
		anul = sc.nextInt();
		
		String zodia = "unknown";
		if( luna == 3 )
		{
			if( ziua < 21 )
			{
				zodia = "Pesti";
			}
			else
			{
				zodia = "Berbec";
			}
		}
		if( luna == 4 )
		{
			if( ziua < 20 )
			{
				zodia = "Berbec";
			}
			else
			{
				zodia = "Taur";
			}
		}
		if( luna == 5 )
		{
			if( ziua < 21 )
			{
				zodia = "Taur";
			}
			else
			{
				zodia = "Gemeni";
			}
		}
		System.out.println(zodia);
	}
}
