package main;

import java.util.Scanner;

import com.byMCV.Test.Abracadabra;

public class RunMe0202CuMenu
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);

		//variabile locale
		String lastName;
		String firstName;
		String gender;
		
		int op = -1;
		
//		Abracadabra a1 = new Abracadabra();
//		Abracadabra a2 = new Abracadabra();
//		System.out.println( a1 );
//		System.out.println( a2 );
		
		Contact c1 = new Contact();
		
		while( op != 3)
		{
			System.out.println("1. Adauga un contact");
			System.out.println("2. Afisare agenda");
			System.out.println("3. Exit");
			
			op = sc.nextInt();
			sc.nextLine();
			
			if( op == 1 )
			{
				System.out.println("Adaugati un contact : nume prenume gender");
				lastName  = sc.nextLine();
				firstName = sc.nextLine();
				gender    = sc.nextLine();
				
				
				c1.nume    = lastName;
				c1.prenume = firstName;
				c1.gender  = gender;
			}
			
			if(op == 2)
			{
				//System.out.println ( sc );
				System.out.println ( c1 );
			}
		}
		
	}

}
