package main;

import java.util.Scanner;

import bean.Persoana;

import factories.AgendaTelefonicaInregistrareFactory;

public class RunMe
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		AgendaTelefonica at = new AgendaTelefonica();
		
		int op = -1;
		
		while(op != 11)
		{
			System.out.println( " 1.Adauga Ok");
			System.out.println( " 2.Adauga Prea Incalcit");
			System.out.println( " 3.Salveaza in fisier txt");
			System.out.println( " 4.Incarca din fisier txt");
			System.out.println( " 5.Salveaza in fisier de obiecte");
			System.out.println( " 6.Incarca din fisier de obiecte");
			System.out.println( "10.Afiseaza");
			System.out.println( "11.Exit");
			
			op = sc.nextInt();
			sc.nextLine();
			
			if(op == 1)
			{
				String nume, prenume, telefon, email;
				
				nume    = sc.nextLine();
				prenume = sc.nextLine();
				telefon = sc.nextLine();
				email   = sc.nextLine();
				
				AgendaTelefonicaInregistrareFactory.createEntry( at, nume, prenume, telefon, email);
			}
			if(op == 2)
			{
				String nume, prenume, telefon;
				
				nume    = sc.nextLine();
				prenume = sc.nextLine();
				telefon = sc.nextLine();
												
				try
				{
					at.createAndAdd( nume, prenume, telefon, "" );
				}
				catch(Exception ex)
				{
					
				}
			}
			if(op == 3)
			{
				at.exportaText("", "agenda.txt");
			}
			if(op == 4)
			{
				at.importaText("", "agenda.txt");
			}
			if(op == 5)
			{
				at.exportaObject("", "agenda.obj");
			}
			if(op == 6)
			{
				at.importaObject("", "agenda.obj");
			}
			if(op == 10)
			{
				System.out.println( at );
			}
		}
		
	}

}
