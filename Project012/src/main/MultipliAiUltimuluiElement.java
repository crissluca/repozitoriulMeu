package main;

import java.util.Scanner;

public class MultipliAiUltimuluiElement
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		//declarare
		int arr[];
		
		
		//alocarea a n de elemente
		//crearea undei zone de memorie cu 100 de elemente		
		arr = new int[n];	//= stochez referinta zonei de memorie nou creata
		
		for(int i=0;i<n;i++)
		{
			arr[i] = (int) (Math.random()*1000) % 10;
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		int ultimulElement = arr[n-1];
		
		for(int i=0;i<n;i++)
		{
			if( arr[i] % ultimulElement == 0)
			{
				System.out.print(arr[i] + " ");
			}
			
		}
		System.out.println();
	}

}
