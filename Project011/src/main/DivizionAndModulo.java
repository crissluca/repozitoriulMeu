package main;

public class DivizionAndModulo
{

	public static void main(String[] args)
	{
		int i,n;
		
		n = 9;
		
		int nr = 46;
		
		for(i=1;i<=n;i++)
		{
			System.out.println( nr + "/" + i + " = " + nr/i + "    " + (double)nr / i);
		}
		
		double d = 10.0;
		if ( d % 1 == 0)
		{
			System.out.println("dasD");
		}
	
			
	}

}