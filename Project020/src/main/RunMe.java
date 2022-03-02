package main;

import java.io.BufferedReader;
import java.io.FileReader;

import beans.Oras;

public class RunMe
{

	public static void main(String[] args)
	{
		String line;
		
		Oras orase[];
		
		int nrOrase = 0;
		
		//try with resources
		try(BufferedReader br = new BufferedReader(new FileReader("orase-date.csv")) )
		{
			line = br.readLine();
			
			while( (line = br.readLine()) != null )
			{
				nrOrase ++;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		orase = new Oras[nrOrase];
		int orasulCurent = 0;
		try(BufferedReader br = new BufferedReader(new FileReader("orase-date.csv")) )
		{
			line = br.readLine();
			
			while( (line = br.readLine()) != null )
			{
				int id = -1;
				String nume;
				String judet;
				int populatie;
				
				if(line.indexOf(",") > -1)
				{
					try
					{
						id = Integer.parseInt( line.substring(0, line.indexOf(",")));
					}
					catch(Exception ex)
					{
						System.out.println("ERR0014 - invalid file structure. Line no " + (1+1+orasulCurent) + " : >" + line + "< id should be a number");
					}
					line = line.substring(line.indexOf(",")+1);
				}
				else
				{
					throw new Exception("ERR0010 - invalid file structure. Line no " + (1+1+orasulCurent) + " : " + line + " is incomplet");
				}
				
				if(line.indexOf(",") > -1)
				{
					nume = line.substring(0, line.indexOf(","));
					line = line.substring(line.indexOf(",")+1);
				}
				else
				{
					throw new Exception("ERR0011 - invalid file structure. Line no " + (1+1+orasulCurent) + " : " + line + " is incomplet");
				}
				
				if(line.indexOf(",") > -1)
				{
					judet = line.substring(0, line.indexOf(","));
					line = line.substring(line.indexOf(",")+1);
				}
				else
				{
					throw new Exception("ERR0012 - invalid file structure. Line no " + (1+1+orasulCurent) + " : " + line + " is incomplet");
				}

				try
				{
					populatie = Integer.parseInt( line );				
				}
				catch(Exception ex)
				{
					populatie = 0;
					
					System.out.println("WRN0001 - invalid file structure. Line no " + (1+1+orasulCurent) + " : " + line + " field populatie should be a number");
				}
				
				orase[ orasulCurent ] = new Oras(id, nume, judet, populatie);
				
				
				orasulCurent++;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		for(int i=0;i<orase.length;i++)
		{
			System.out.println( orase[ i ] );
		}
			

	}

}
