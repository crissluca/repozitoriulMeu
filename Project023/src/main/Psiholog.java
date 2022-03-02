package main;

import beans.Board;
import beans.Conducere;
import beans.Human;
import beans.Worker;

public class Psiholog
{
	int clienti;
	public Human humans[] = new Human[2+10+5];
	
	//In java transmiterea parametrilor de tip obiect al unei clase se face prin REFERINTA
	public void startTherapy(Human h)
	{
		humans[clienti++] = h;
	}
	
	public void consiliere(Conducere c)
	{
		
	}
	
	public void nlp( Board b )
	{
		
	}
}
