package main;

import java.util.ArrayList;

import bean.InstrumentFinanciar;

public class InstrumenteFinanciareSecventialArrayList
{
	ArrayList<InstrumentFinanciar> arr; //Generics -> Clase Generice
	
	public InstrumenteFinanciareSecventialArrayList()
	{
		arr = new ArrayList<>(); //diamond operator	
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
