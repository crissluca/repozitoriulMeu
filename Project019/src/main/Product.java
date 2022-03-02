package main;

public class Product
{	
	String nume;
	//relatie de tip Has A : Product has a Price
	Money price;
	
	public Product(String nume, Money price)
	{
		this.nume = nume;
		this.price = price;
	}
	
	public void increasePrice(int lei, int bani)
	{
		price.setLei( price.getLei() + lei );		
		price.setBani( price.getBani() + bani );
	}
	
	public void decreasePrice(int lei, int bani)
	{
		price.setLei( price.getLei() - lei );		
		price.setBani( price.getBani() - bani );
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(nume).append(" costa ").append(price);
		return sb.toString();
	}
}
