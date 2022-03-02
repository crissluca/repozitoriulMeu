package beans;

public class Person
{
	String nume;
	String prenume;
	
	private static int cate;
	
	public Person(String nume, String prenume)
	{
		this.nume = nume;
		this.prenume = prenume;
		
		cate = cate + 1;
	}
	
	public static int getHowManyObjects()
	{
		return cate;
	}
}
