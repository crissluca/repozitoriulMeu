package main;

// Program the Money class
// the class object operates one currency
public class Money
{	
	//This class must provide a field to store the integer portion
	//of the money (dollars, euro, hryvnias, etc.) and a field to store
	//coins (cents, euro coins, kopecks, etc.)
	private int lei;
	private int bani;
	
	public Money(int lei, int bani)
	{
		setLei(lei);
		setBani(bani);
	}
		
	//set values for portions of the money
	public void setLei(int lei)
	{
		this.lei = lei;
	}	
	
	public void setBani(int bani)
	{
		this.bani = bani;
	}
	
	//due to the mode we need to use this class in Product
	public int getLei()
	{
		return lei;
	}
	
	public int getBani()
	{
		return bani;
	}
	
	
	//Implement methods that display the sum
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(lei).append(" lei si ").append(bani).append(" bani");
		
		return sb.toString();
	}
}
