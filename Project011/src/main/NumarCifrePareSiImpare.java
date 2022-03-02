package main;

import java.util.Scanner;

public class NumarCifrePareSiImpare
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		
		int nr, cnr;
		
		int catePare, cateImpare;
		
		int cifra;
		
		int nrTotalDePare;
		int nrTotalDeImpare;
		
		
		
		
		n = sc.nextInt();
		
		nrTotalDePare = 0;
		nrTotalDeImpare = 0;

		
		i = 0;
		while(i<n)
		{
			nr = sc.nextInt();
			
			catePare = 0;
			cateImpare = 0;
			
			cnr = nr;
			while( cnr > 0 )
			{
				cifra = cnr % 10;
				
				if( cifra % 2 == 0)
				{
					catePare = catePare + 1;
				}
				else
				{
					cateImpare = cateImpare + 1;
				}
				
				cnr = cnr / 10;
			}
			
			nrTotalDePare = nrTotalDePare + catePare;
			nrTotalDePare = nrTotalDeImpare + cateImpare;

			i = i + 1;
		}
		
		System.out.println("CatePare=" + nrTotalDePare + " CateImpare=" + nrTotalDePare);
		

	}

}
