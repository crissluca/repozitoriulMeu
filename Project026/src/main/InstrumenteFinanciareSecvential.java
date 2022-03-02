package main;

import bean.InstrumentFinanciar;

public class InstrumenteFinanciareSecvential
{
	int maxLength;
	int k;
	InstrumentFinanciar arr[];
	
	public InstrumenteFinanciareSecvential(int nr)
	{
		maxLength = nr;
				
		arr = new InstrumentFinanciar[ maxLength];		
	}
	
	public void add(InstrumentFinanciar fi)
	{		
		if(fi == null)
		{
			return;
		}
		if(k == maxLength)
		{
			return;
		}
		
		arr[k++] = fi;
	}
	
	
	//cautare secventiala
	public InstrumentFinanciar search( String isin )
	{
		InstrumentFinanciar gasit = null;
		for(int i=0;i<k && gasit == null;i++)
		{
			if( arr[i].getISIN().equals( isin ) )
			{
				gasit = arr[i];
			}
		}
		return gasit;
	}
}
