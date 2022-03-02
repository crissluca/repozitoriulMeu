package main;

import beans.Worker;

public class HR
{
	int angajati;
	public Worker workers[] = new Worker[2+10+5];
	
	//In java transmiterea parametrilor de tip obiect al unei clase se face prin REFERINTA
	public void hire(Worker w)
	{
		workers[angajati++] = w;
	}
		
	//POLIMORFISM
	public void work(Worker w)  //variabila de tip clasa abstracta : parametru formal
	{
		w.work();
	}	
	
	//transmiterea parametrilor de tip primitiv (nu obiecte de clase) se face prin VALOARE
	public void setAngajati(int angajat) 
	{
		this.angajati = angajati;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("America's HR\n");
		for(int i=0;i<angajati;i++)
		{
			sb.append("     ").append( workers[i] ).append("\n");
		}
		
		return sb.toString();
	}
}
