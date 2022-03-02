package main;

import java.util.ArrayList;

public class ArrayCollection
{
	int maxLimit;	
	ArrayList ar;
	
	public ArrayCollection( int maxLimit )
	{
		this.maxLimit = maxLimit;
		
		ar = new ArrayList();
	}
	
	public void add(int nr)
	{
		ar.add(nr);
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i< ar.size();i++)
		{
			sb.append( ar.get(i) ).append(" ");
		}
		
		return sb.toString();
	}
}
