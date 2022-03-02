package main;

import java.util.GregorianCalendar;
import java.util.Random;

import threads.Maxim;
import threads.Minim;
import tools.VariabileGlobale;

public class RunMe
{
/*
  		//Variabilele de tip clasa nu contin obiectul
		//contin o referinta la acel obiect
		
		VariabileGlobale vg1 = VariabileGlobale.getInstance();
		VariabileGlobale vg2 = VariabileGlobale.getInstance();
		
		//asa gestioneaza java sirurile de caractere
		//Clasa String este o clasa Imutabila
		String a = "java";
		String b = "java";
		
		String c = new String("java");
		
		if( a == b ) //referinta
		{
			System.out.println("Sirul de caractere constant \"java\" este accesat in acelasi timp si prin variabila a si prin variabila b");
		}
		
		if( a == c )
		{
			System.out.println("Sirul de caractere constant \"java\" este accesat in acelasi timp si prin variabila a si prin variabila b");
		}
		else
		{
			System.out.println("Sirul de caractere constant \"java\" este de doua ori in memorie odata accesat de a sau b si a doua ora accesat de c");
		}
 */
	
	public static void main(String[] args) throws InterruptedException
	{
		GregorianCalendar gc = new GregorianCalendar();
		
		Random r = new Random();
		r.setSeed( gc.getTimeInMillis() );
		
		
		VariabileGlobale vg = VariabileGlobale.getInstance();
		
		vg.n = r.nextInt() % 10000;
		if( vg.n < 0)
		{
			vg.n = -vg.n;
		}
		
		vg.v = new int[vg.n];
		
		for(int i=0;i<vg.n;i++)
		{
			vg.v[i] = r.nextInt() % 10000;
		}
		
		new Maxim().start();
		new Minim().start();
		
		while(vg.minim == 0 || vg.maxim == 0)
		{

		}
		
		System.out.println(vg.minim + " " + vg.maxim);
	}
}
