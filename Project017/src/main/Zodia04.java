package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zodia04
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
				
		try( BufferedReader br = new BufferedReader( new FileReader( "zodiac01.csv" )) )
		{		
			String line;
			
			while( (line = br.readLine()) != null)
			{
			
				String sLuna;
				int    iLuna;
				
				String sZiua;			
				int    iZiua;
				
				String zodia1;
				String zodia2;
				
				
				sLuna = line.substring(0, line.indexOf(" "));
				iLuna = Integer.parseInt(sLuna);			
				line = line.substring( line.indexOf(" ") + 1);
									
				sZiua = line.substring(0, line.indexOf(" "));
				iZiua = Integer.parseInt(sZiua);			
				line = line.substring( line.indexOf(" ") + 1);
				
				zodia1 = line.substring(0, line.indexOf(" "));					
				line = line.substring( line.indexOf(" ") + 1);
				
				zodia2 = line;
				
				if( luna == iLuna )
				{
					if( ziua < iZiua )
					{
						zodia = zodia1;
					}
					else
					{
						zodia = zodia2;
					}
				}			
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
