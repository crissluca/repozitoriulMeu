package main;

import bean.InstrumentFinanciar;

public class InstrumenteFinanciareHash
{
	int maxLength;

	InstrumentFinanciar arr[];
	
	public InstrumenteFinanciareHash(int nr)
	{
		maxLength = nr;
				
		arr = new InstrumentFinanciar[ maxLength];		
	}
	
	public int hashCode(String isin)
	{
		int hash = 0;
		
		for(int i=0;i<isin.length();i++)
		{
			//System.out.println( maxLength + " " + hash + " " + (int) isin.charAt(i));
			hash = hash + ((int) isin.charAt(i)); 
		}
		
		return hash;
	}
	
	public void put(InstrumentFinanciar fi)
	{		
		if(fi == null)
		{
			return;
		}
		
		int hash = hashCode( fi.getISIN() );
		
		hash = hashOfIsinString(fi.getISIN());
		
		System.out.println(fi.getISIN()+ " " + hash);
		
		arr[ hash ] = fi;
	}

	private int hashOfIsinString( String isin )
	{
		int hash;
		hash = isin.hashCode();
		if(hash < 0)
		{
			hash = -hash;
		}
		hash = hash % maxLength;
		
		return hash;
	}
	
	public InstrumentFinanciar get( String isin )
	{
		int hash;
		
		InstrumentFinanciar gasit;
		
		hash = hashOfIsinString( isin );
		
		gasit = arr[ hash ];
				
		return gasit;
	}
}
