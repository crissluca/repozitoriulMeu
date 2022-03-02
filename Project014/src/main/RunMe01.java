package main;

import java.util.Scanner;

import com.byMCV.Test.Abracadabra;

public class RunMe01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);

		//variabile locale
		String lastName;
		String firstName;
		String gender;
		
//		Abracadabra a1 = new Abracadabra();
//		Abracadabra a2 = new Abracadabra();
//		System.out.println( a1 );
//		System.out.println( a2 );
		
		lastName = sc.nextLine();
		firstName = sc.nextLine();
		gender = sc.nextLine();
		
		Contact c1 = new Contact();
		c1.nume    = lastName;
		c1.prenume = firstName;
		c1.gender  = gender;
		
		System.out.println ( sc );
		System.out.println ( c1 );
		
		
	}

}
