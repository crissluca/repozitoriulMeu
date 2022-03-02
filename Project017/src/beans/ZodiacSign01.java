package beans;

import tools.VariabileGlobale;

public class ZodiacSign01
{
	ZodiacLine01 zc;
	
	public ZodiacSign01( ZodiacLine01 zc )
	{
		this.zc = zc;
	}
	
	public String getSign(int ziua, int luna, int anul)
	{
		String sign = VariabileGlobale.UNKNOWN;
		
		if( luna == zc.iLuna )
		{
			if( ziua < zc.iZiua )
			{
				sign = zc.zodia1;
			}
			else
			{
				sign = zc.zodia2;
			}
		}
		return sign;
	}
}
