package main;

import java.util.ArrayList;
import java.util.Vector;

import bean.InstrumentFinanciar;

public class InstrumenteFinanciareSecventialVector
{
	Vector<InstrumentFinanciar> arr; //Generics -> Clase Generice
	
	public InstrumenteFinanciareSecventialVector()
	{
		arr = new Vector<>(); //diamond operator	
	}
	
	public void add(InstrumentFinanciar fi)
	{		
		if(fi == null)
		{
			return;
		}
		
		arr.add( fi ) ;
	}
	
	//cautare secventiala
	public InstrumentFinanciar search( String isin )
	{
		InstrumentFinanciar gasit = null;
		for(int i=0;i<arr.size() && gasit == null;i++)
		{
			if( arr.get(i).getISIN().equals( isin ) )
			{
				gasit = arr.get(i);
			}
		}
		return gasit;
	}
}
