package main;

import java.util.Scanner;

import com.byMCV.Test.Abracadabra;

public class RunMe03CuMenuSiArray
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
		
		
		int nrContacte = 0;
		Contact contacte[] = new Contact[100];
		
		while( op != 3)
		{
			for(int i=0;i<10;i++);
			{
				System.out.println();
			}
			System.out.println("1. Adauga un contact");
			System.out.println("2. Afisare agenda");
			System.out.println("3. Exit");
			
			op = sc.nextInt();
			sc.nextLine();
			
			if( op == 1)
			{
				System.out.println("Adaugati un contact : nume prenume gender");
				lastName  = sc.nextLine();
				firstName = sc.nextLine();
				gender    = sc.nextLine();
				
				contacte[nrContacte] = new Contact();
				
				contacte[nrContacte].nume    = lastName;
				contacte[nrContacte].prenume = firstName;
				contacte[nrContacte].gender  = gender;
				
				nrContacte ++;
				
			}
			
			if(op == 2)
			{
				//System.out.println ( sc );
				for(int i=0;i<nrContacte;i++)
				{
					System.out.println ( contacte[i] );
				}
			}
		}
		
	}

}
