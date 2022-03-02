package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bean.Persoana;
import factories.AgendaTelefonicaInregistrareFactory;

public class AgendaTelefonica
{
	ArrayList<Persoana> agenda;
	
	public AgendaTelefonica()
	{
		agenda = new ArrayList<>();
	}

	/**
	 * Adauga o persoana
	 * 
	 * @param p
	 * @throws Exception
	 */
	public void add(Persoana p) throws Exception
	{
		if(p == null)
		{
			throw new Exception("E0001 - Cannot add a null person");
		}
		agenda.add(p);
	}
	
	//nu agenda ar trebui sa creeze o persoana
	@Deprecated
	public void createAndAdd(String nume, String prenume, String telefon, String email) throws Exception
	{
		Persoana p = null;
		
		try
		{
			p = new Persoana(nume, prenume, telefon, email);
		}
		catch(Exception ex)
		{
			System.out.println("E0004 - Cannot create a new Entry " + ex);
		}
		
		if(p == null)
		{
			throw new Exception("E0001 - Cannot add a null person");
		}
		agenda.add(p);
	}
	
	public void exportaText(String path, String numeFisier)
	{
		
		//Design Pattern : Decorator
		try(BufferedWriter bw = new BufferedWriter(new FileWriter( path + numeFisier) ) )
		{
			bw.write( this.toString() );
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public void importaText(String path, String numeFisier)
	{
		try(BufferedReader br = new BufferedReader( new FileReader( path + numeFisier)))
		{
			String nume;
			String prenume;
			String telefon;
			
			String linie;
			
			while( (linie = br.readLine()) != null)
			{
				nume = linie.substring(0,  linie.indexOf(" "));
				linie= linie.substring( linie.indexOf(" ") +1);
				prenume = linie.substring(0,  linie.indexOf(" "));
				linie= linie.substring( linie.indexOf(" ") +1);
				telefon = linie;
				
				AgendaTelefonicaInregistrareFactory.createEntry( this, nume, prenume, telefon, "" );
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	public void exportaObject(String path, String numeFisier)
	{
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(path + numeFisier) ) )
		{
			for(int i=0;i<agenda.size();i++)
			{
				oos.writeObject( agenda.get(i) );
			}
			
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public void importaObject(String path, String numeFisier)
	{
		try( ObjectInputStream ois = new ObjectInputStream( new FileInputStream(path + numeFisier) ) )
		{
			Object obj;
			boolean endOfFile = false; //EOF
			while( !endOfFile )
			{
				try
				{
					obj = ois.readObject();
					agenda.add( (Persoana) obj ) ;
				}
				catch(EOFException ex)
				{
					endOfFile = true;
				}
				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Oops " + ex);
		}
	}

	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<agenda.size();i++)
		{
			sb.append( agenda.get(i) ).append("\n");
		}
		return sb.toString();
	}

}

