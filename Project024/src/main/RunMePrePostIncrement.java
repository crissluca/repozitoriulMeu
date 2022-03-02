package main;

public class RunMePrePostIncrement
{

	public static void main(String[] args)
	{
		int i;
		
		
		i = 0;
		
		System.out.println( i + 1 ); // `1
		
		
		
		System.out.println( i++ );  // 0  post incrementear i = i + 1;
		
		
		
		System.out.println( i );    //1
		i = i + 1;
		
		System.out.println( i );   // 2
		
		
		System.out.println( --i ); //         predecrementare  i = i - 1
		
		
		i = i - 1;
		System.out.println( i );
		
		int a = 4;
		int b = 5;
		int c;
		//b=5;
		b++;  //b = b + 1;
		//b=6;
		
		//a = 4;
		//b = 6;
		a = b++;
		//a = 6;
		//b = 7;
		
		//a = 6
		a++;
		//a = 7
		
		System.out.println(a + " " + b);
		
		//a = 7
		//b = 7
		//a = 8
		c = ++a + b++;
		//c = 15
		//a = 8
		//b = 8

		System.out.println(a + " " + b + " " + c);
	}

}
