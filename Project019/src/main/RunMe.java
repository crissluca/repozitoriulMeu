package main;

public class RunMe
{
	public static void main(String args[])
	{
		Money portofel = new Money(250, 50);
		
		System.out.println( portofel );
		
		Money tShirtPrice = new Money( 120, 0 );
		
		Product tShirt = new Product( "tShirt", tShirtPrice );
		
		System.out.println( tShirt );
		
		tShirt.decreasePrice( 10, 50 );
		
		System.out.println( tShirt );
	}
}
