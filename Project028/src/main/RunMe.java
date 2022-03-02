package main;

public class RunMe
{
	public static void afisarePrimeleNiterativ( int n)
	{
		int i;
		
		i = 0;
		while(i < n)
		{
			System.out.print( n - i + " ");
			i = i + 1;
		}
		System.out.println();
		
	}
	
	public static void afisarePrimeleNrecursiv( int n )
	{
		if( n > 0 )
		{
			
			afisarePrimeleNrecursiv( n - 1 );
			System.out.print( n + " " );
		}
		else
		{
			//pentru descrescator
			//System.out.println();
		}
	}
	
	public static int sumaCifrelorIterativ(int nr)
	{
		int cnr = nr;
		int suma;
		int cifra;
		
		
		suma = 0;
		while( cnr > 0)
		{
			cifra = cnr % 10;
		
			suma = suma + cifra;
			
			cnr = cnr / 10;
		}
			
		return suma;
	}
	
	public static int sumaCifrelorRecursiv(int nr)
	{
		int cifra;
		int suma;
		
		if( nr > 0 )
		{
			cifra = nr % 10;
			
			suma = sumaCifrelorRecursiv( nr / 10 ) + cifra;
		}
		else
		{
			suma = 0;
		}
		
		return suma;
	}
	
	public static void main(String[] args)
	{
		int n = 10;
		
		afisarePrimeleNiterativ( n );
		
		afisarePrimeleNrecursiv( n );
		
		System.out.println();
		
		int nr = 12345;
		System.out.println( "iterativ " + sumaCifrelorIterativ( nr ) );
		System.out.println( "recursiv " + sumaCifrelorRecursiv( nr ) );
	}

}
