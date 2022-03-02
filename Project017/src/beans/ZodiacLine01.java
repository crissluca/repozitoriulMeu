package beans;

import tools.VariabileGlobale;

public class ZodiacLine01
{
	String sLuna;
	public int    iLuna;
	
	String sZiua;			
	public int    iZiua;
	
	public String zodia1;
	public String zodia2;
	
	public ZodiacLine01(String line)
	{
		parseLine(line);
	}
	
	public void parseLine(String line)
	{
		sLuna = line.substring(0, line.indexOf( VariabileGlobale.CSV_SEPARATOR ));
		iLuna = Integer.parseInt(sLuna);			
		line = line.substring( line.indexOf( VariabileGlobale.CSV_SEPARATOR ) + 1);
							
		sZiua = line.substring(0, line.indexOf( VariabileGlobale.CSV_SEPARATOR ));
		iZiua = Integer.parseInt(sZiua);			
		line = line.substring( line.indexOf( VariabileGlobale.CSV_SEPARATOR ) + 1);
		
		zodia1 = line.substring(0, line.indexOf(VariabileGlobale.CSV_SEPARATOR ));					
		line = line.substring( line.indexOf( VariabileGlobale.CSV_SEPARATOR ) + 1);
		
		zodia2 = line;
	}
}
