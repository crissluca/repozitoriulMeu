package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import beans.ZodiacLine01;
import beans.ZodiacSign01;
import tools.VariabileGlobale;

public class Zodia05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int ziua, luna, anul;
		
		System.out.println("Introduceti data nasterii sub forma Zi Luna An");

		ziua = sc.nextInt();
		luna = sc.nextInt();
		anul = sc.nextInt();
		
		String zodia = VariabileGlobale.UNKNOWN;
				
		try( BufferedReader br = new BufferedReader( new FileReader( "zodiac01.csv" )) )
		{		
			String line;
			
			while( (line = br.readLine()) != null && zodia.equals(VariabileGlobale.UNKNOWN))
			{
			
				ZodiacSign01 zs = new ZodiacSign01( new ZodiacLine01( line ) );		
				zodia = zs.getSign(ziua, luna, anul);				
				
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("ERR0001 - NU am gasit fisierul de zodii");
		}
		catch(IOException ex)
		{
			System.out.println("ERR0002 - Nu am reusit sa citesc tot fisierul");
		}
		catch(NullPointerException ex)
		{
			System.out.println("ERR0003 - Fisierul nu contine date suficiente");
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("ERR0004 - Linia nu este completa");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("ERR0005 - Structura fisierului nu este valida");
		}
				
		System.out.println(zodia);
	}
}
