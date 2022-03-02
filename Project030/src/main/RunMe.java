package main;

import threads.SearchCats;

public class RunMe
{
	public static void main(String[] args)
	{
		System.out.println("Main Thread started");
		
		SearchCats sc03 = new SearchCats("Q:\\Camera03\\");
		sc03.start();
		
		SearchCats sc05 = new SearchCats("Q:\\Camera05\\");
		sc05.start();
		
		SearchCats sc06 = new SearchCats("Q:\\Camera06\\");
		sc06.start();
		
		SearchCats sc07 = new SearchCats("Q:\\Camera07\\");
		sc07.start();
		
		System.out.println("Main Thread ended");
	}

}
