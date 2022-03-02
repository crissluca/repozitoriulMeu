package main;

public class ArrayPrimitiv
{
	int maxLimit;
	int k;
	int array[];
	
	public ArrayPrimitiv( int maxLimit )
	{
		this.maxLimit = maxLimit;
		
		array = new int[maxLimit];
	}
	
	public void add(int nr)
	{
		array[k++] = nr;
		
		//incrementare
		//k++; //k = k + 1;
		
		//postincrement
		//k++;
		
		//preincrement
		//++k;
	}
	
	public void sterge( int poz )
	{
		for(int i=poz;i<k-1;i++)
		{
			array[i] = array[i+1];
		}

		k--; //k--; k = k - 1;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<k;i++)
		{
			sb.append(array[i]).append(" ");
		}
		
		return sb.toString();
	}
}
