package bean;

import java.io.Serializable;

public class Persoana implements Serializable
{
	private static final long serialVersionUID = 7375220217331881705L;
	
	String nume;
	String prenume;
	String telefon;
	String email;
	
	public Persoana(String nume, String prenume, String telefon, String email) throws Exception
	{
		setNume(nume);
		setPrenume(prenume);
		setTelefon(telefon);
		this.email = email;
	}
	
	/**
	 * @return the nume
	 */
	public String getNume()
	{
		return nume;
	}

	/**
	 * @param nume the nume to set
	 * @throws Exception 
	 */
	public void setNume(String nume) throws Exception
	{
		if( nume == null )
		{
			throw new Exception("E0002 - Nume invalid");
		}
		if( nume.isEmpty() )
		{
			throw new Exception("E0003 - Nume invalid");
		}
		this.nume = nume;
	}

	/**
	 * @return the prenume
	 */
	public String getPrenume()
	{
		return prenume;
	}

	/**
	 * @param prenume the prenume to set
	 */
	public void setPrenume(String prenume)
	{
		this.prenume = prenume;
	}

	/**
	 * @return the telefon
	 */
	public String getTelefon()
	{
		return telefon;
	}

	/**
	 * @param telefon the telefon to set
	 */
	public void setTelefon(String telefon)
	{
		this.telefon = telefon;
	}
	
	@Override
	public String toString()
	{
		return nume + " " + prenume + " " + telefon + " " + email;
	}
}
