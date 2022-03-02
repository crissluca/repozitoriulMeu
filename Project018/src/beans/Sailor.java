package beans;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sailor extends Human
{
	public Sailor(String fullName, GregorianCalendar dateOfBirth) throws Exception
	{
		super(fullName, dateOfBirth );
	}
	
	public Sailor(String firstName, String lastName, GregorianCalendar dateOfBirth) throws Exception
	{
		super( firstName, lastName, dateOfBirth);
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("fullName")   .append(SEPARATOR).append("Captain ").append(getFullName()).append("\n");
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
