package beans;

import tools.VariabileGlobale;

public class ZodiacLine02
{	
	
	public int luna;			
	public int ziua;
	
	public String zodia1;
	public String zodia2;
	
	public ZodiacLine02(String line)
	{
		parseLine(line);
	}
	
	public void parseLine(String line)
	{
		luna = getNextNumber(line);
		line = removeFirstToken(line);
							
		ziua = getNextNumber(line);
		line = removeFirstToken(line);
		
		zodia1 = line.substring(0, line.indexOf( VariabileGlobale.CSV_SEPARATOR ));					
		line = removeFirstToken(line);
		
		zodia2 = line;
	}

	private String removeFirstToken(String line)
	{
		line = line.substring( line.indexOf( VariabileGlobale.CSV_SEPARATOR ) + 1);
		
		return line;
	}

	private int getNextNumber(String line)
	{
		String sNumber;
		int iNumber;
		
		sNumber = line.substring(0, line.indexOf( VariabileGlobale.CSV_SEPARATOR ));
		iNumber = Integer.parseInt(sNumber);			
		
		return iNumber;
	}
}
