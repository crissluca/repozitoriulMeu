package main;

import beans.Conducere;
import beans.Engineer;
import beans.HumanResource;
import beans.Manager;
import beans.President;
import beans.Security;
import beans.Worker;

public class RunMe
{

	public static void main(String[] args)
	{
		President p = null;
		
		try
		{
			p = new President("Obama");
			System.out.println(p);
			
			p.work();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		Engineer e1 = null;
		
		try
		{
			e1 = new Engineer("Elon");
			System.out.println(e1);
			
			e1.work();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		Engineer e2 = null;
		
		try
		{
			e2 = new Engineer("Bill");
			System.out.println(e2);
			
			e2.work();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		Manager m = null;
		
		try
		{
			m = new Manager("Mihai");			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		HumanResource hrp = null;
		
		try
		{
			hrp = new HumanResource("Mihai");			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		HR hr = new HR();
		hr.hire(e1); //Obiect al clasei copil : parametru actual
		hr.hire(p);
		hr.hire(e2);
		hr.hire(m);
		hr.hire(hrp);
		
		hrp.setHR(hr);
		
		System.out.println( hr );
		
		
		Psiholog ph = new Psiholog();
		ph.startTherapy( e2 );
		ph.startTherapy( p );
		ph.startTherapy( m );
		
		ph.consiliere( p );
		if( m instanceof Conducere)
		{
			ph.consiliere( m );
		}
		
		ph.consiliere( (Conducere) e2 );	
		
		//int a = 0;
		//String s = null;
		
		
		//Uncheked - RuntimeException
		//System.out.println( a / 0 );
		
		//System.out.println( a / a );
		
		//System.out.println( s.length() );
		
		ph.nlp(p);
		//ph.nlp( m );
	}

}


