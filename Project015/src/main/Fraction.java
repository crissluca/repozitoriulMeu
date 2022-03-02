package main;

public class Fraction
{
	//membri
	int numarator;
	int numitor;
	
	//protected Fraction this;
	
	//constructor implicit
	public Fraction()
	{
		
	}
	
	//definesc un constructor cu parametri clasei
	public Fraction(int numarator, int numitor) //parametri formali
	{
		this.numarator = numarator;
		
		setNumitor( numitor );
	}

	public Fraction addition( Fraction theOtherOne )
	{
		Fraction result = new Fraction();
		
		int numitorComun = numitor * theOtherOne.numitor;
		//cmmmc : cel mai mare multiplu comun		
		result.setNumitor( numitorComun );
		
		//variabila numarator locala functiei addition
		int numarator = this.numarator * theOtherOne.numitor + numitor * theOtherOne.numarator;
		result.setNumarator( numarator );
		
		return result;
	}
	
	public void setNumarator(int numarator)
	{
		this.numarator = numarator;
	}
	
	public void setNumitor( int numitor )
	{
		this.numitor = numitor;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(numarator).append(" / ").append(numitor);
		return sb.toString();
	}
}
