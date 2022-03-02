package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zodia02
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
		
		BufferedReader br;
		try
		{
			br = new BufferedReader( new FileReader( "zodiac01.csv" ));
			
			String line;
			
			line = br.readLine();
			
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
			
			br.close();	
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("NU am gasit fisierul de zodii");
		}
		catch(IOException ex)
		{
			System.out.println("Nu am reusit sa citesc tot fisierul");
		}
		catch(NullPointerException ex)
		{
			System.out.println("Fisierul nu contine date suficiente");
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("Linia nu este completa");
		}
				
		System.out.println(zodia);
	}
}
