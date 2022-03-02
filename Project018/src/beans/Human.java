package beans;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Human
{
	public static final String SEPARATOR = " ";	
	public static final int MIN_AGE = 10;
	
	private String fullName;
	protected GregorianCalendar dateOfBirth;
	protected String phoneNumber;
	protected String city;
	protected String country;
	protected String homeAddress;
	
	public Human()
	{
		
	}
	
	public Human(String fullName, GregorianCalendar dateOfBirth) throws Exception
	{
		setFullName( fullName );
		
		setDateOfBirth( dateOfBirth );
	}
	
	public Human(String firstName, String lastName, GregorianCalendar dateOfBirth) throws Exception
	{
		setFullName( firstName, lastName );
		
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setFullName( String fullName ) throws Exception
	{
		if(fullName.indexOf(" ") == -1)
		{
			throw new Exception("Numele trebuie sa contina cel putin un spatiu");
		}
		
		if(fullName.length() < 4)
		{
			throw new Exception("Numele trebuie sa aiba mai mult de 4 caractere");
		}
		
		if(fullName.length() > 99)
		{
			throw new Exception("Numarul maxim de careactere ale unui nume este 99 dar am primit un nume cu " + fullName.length());
		}
		
		this.fullName = fullName;
	}
	
	public void setFullName( String firstName, String lastName ) throws Exception
	{
		setFullName( firstName + " " + lastName );
	}
	
	public String getFullName()
	{
		return fullName;
	}
	
	public void setDateOfBirth( GregorianCalendar dateOfBirth ) throws Exception
	{
		if( dateOfBirth.get(Calendar.YEAR) < 1890 || dateOfBirth.get(Calendar.YEAR) > ( new GregorianCalendar()).get(Calendar.YEAR) - MIN_AGE )
		{
			throw new Exception("Anul nasterii este invalid : " + dateOfBirth.get(Calendar.YEAR) );
		}
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setDateOfBirth( String an, String luna, String zi ) throws Exception
	{		
	}
	
	public void setDateOfBirth( int an, int luna, int zi ) throws Exception
	{		
		
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("fullName")   .append(SEPARATOR).append(fullName).append("\n");
		sb.append("dateOfBirth").append(SEPARATOR);
		if( dateOfBirth != null )
		{
			sb.append(dateOfBirth.get( Calendar.YEAR)).append("/").append(dateOfBirth.get(Calendar.MONTH) + 1).append("/").append(dateOfBirth.get(Calendar.DAY_OF_MONTH)).append("\n");
		}
		else
		{
			sb.append("uknown");
		}
		
		return sb.toString();
	}
}
