package factories;

import bean.Persoana;
import main.AgendaTelefonica;

public class AgendaTelefonicaInregistrareFactory
{
	public static void createEntry(AgendaTelefonica at, String nume, String prenume, String telefon, String email)
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
		
		try
		{
			at.add( p );
		}
		catch(Exception ex)
		{
			
		}
	}
}
