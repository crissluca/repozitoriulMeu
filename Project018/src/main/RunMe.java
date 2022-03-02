package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import beans.Human;
import beans.Sailor;

public class RunMe
{

	public static void main(String[] args)
	{
		String fullName = "Chitea Mihai";
		GregorianCalendar gc = new GregorianCalendar();
		
		gc.set(Calendar.YEAR, 1980);

		
		Human h1 = null;
		try
		{
			h1 = new Human( "Mihai", "Chitea", gc );
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println(h1);
		
		
		Sailor s1 = null;
		try
		{
			s1 = new Sailor( "Mihai", "Chitea", gc );
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println(s1);
	}

}
