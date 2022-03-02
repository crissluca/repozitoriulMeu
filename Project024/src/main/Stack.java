package main;

public class Stack
{
	int maxLimit;
	
	int k;
	
	int stack[];
	
	public Stack(int maxLimit)
	{
		this.maxLimit = maxLimit;
		
		k = 0;
		
		stack = new int[maxLimit];
	}
	
	public void push( int nr )
	{
		stack[k++] = nr;
	}
	
	public int seek()
	{
		return stack[k-1];
	}
	
	public int pop()
	{
		int elem = seek();
		k--;
		return elem;
	}
}
