package beans;

import tools.VariabileGlobale;

public class ZodiacSign02
{
	ZodiacLine02 zc;
	
	public ZodiacSign02( ZodiacLine02 zc )
	{
		this.zc = zc;
	}
	
	public String getSign(int ziua, int luna, int anul)
	{
		String sign = VariabileGlobale.UNKNOWN;
		
		if( luna == zc.luna )
		{
			if( ziua < zc.ziua )
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
