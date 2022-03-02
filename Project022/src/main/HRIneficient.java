package main;

import beans.Engineer;
import beans.Manager;
import beans.President;

public class HRIneficient
{
	President presidents[] = new President[2];
	Engineer engineers[] = new Engineer[10];
	Manager manager[] = new Manager[5];
	
	public void work(President p)
	{
		p.work();
	}
	
	public void work(Engineer e)
	{
		e.work();
	}
	
	public void work(Manager m)
	{
		m.work();
	}
	
}
