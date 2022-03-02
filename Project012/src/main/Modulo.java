package main;

public class Modulo
{

	public static void main(String[] args)
	{
		int a = 45;
		int d = 14;
		
		//restul impartirii lui a la d
		System.out.println("Restul impartirii lui " + a + " la " + d + " : " + a % d );
		
		//este numarul par
		if( a % 2 == 0 ) //verificarea divizibiliatii
		{
			System.out.println(a + " este par");
		}
		else
		{
			System.out.println(a + " este impar");
		}
		
		if( d % 2 == 1 )
		{
			System.out.println(d + " este impar");
		}
		else
		{
			System.out.println(d + " este par");
		}
		
		if( a % d == 0 )
		{
			System.out.println(a + " este divizibil cu " + d + " pentru ca restul impartirii " + a + "/" + d + " este " + a % d);
			System.out.println(a + " este multiplul lui " + d + " pentru ca restul impartirii " + a + "/" + d + " este " + a % d);
		}

		//obtinerea cifrei unitatilor
		int cifra = a % 10;
		
		System.out.println("Cifra unitatilor numarul " + a + " este " + a % 10);
		
		//limitarea unui numar aleator
		int x = ((int) (Math.random() * 1000));
		System.out.println("Am generat la intamplare un numar cu maxim 3 cifre " + x);
		System.out.println("Am generat la intamplare un numar cu maxim 3 cifre limitat la 199 " + x % 200);
	}

}
