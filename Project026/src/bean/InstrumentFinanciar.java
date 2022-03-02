package bean;

public class InstrumentFinanciar extends Object
{
	String denumire;
	String isin;
	String tip; //actiune /  obligatiune / futures / options / otc
	/**
	 * @return the denumire
	 */
	public String getDenumire()
	{
		return denumire;
	}
	/**
	 * @param denumire the denumire to set
	 */
	public void setDenumire(String denumire)
	{
		this.denumire = denumire;
	}
	/**
	 * @return the iSIN
	 */
	public String getISIN()
	{
		return isin;
	}
	/**
	 * @param isin the isin to set
	 */
	public void setISIN(String isin)
	{
		if(isin == null)
		{
			return;
		}
		if(isin.isEmpty())
		{
			return;
		}
		
		this.isin = isin;
	}
	/**
	 * @return the tip
	 */
	public String getTip()
	{
		return tip;
	}
	/**
	 * @param tip the tip to set
	 */
	public void setTip(String tip)
	{
		if(tip == null)
		{
			return;
		}
		this.tip = tip;
	}
	
	@Override
	public String toString()
	{
		return isin + " " + denumire + " " + tip;
	}
	
}
