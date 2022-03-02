package beans;

public class Oras
{
	
	//membri clasei
	private int id;
	private String nume;
	private String judet;
	private int populatie;
	
	
	//constructor cu parametri
	public Oras(int id, String nume, String judet, int populatie) throws Exception //parametri formali
	{
		setId(id);
		
		this.nume = nume;
		this.judet = judet;
		this.populatie = populatie;
	}
	
	public void setId(int id) throws Exception
	{
		if( id < 1 )
		{
			throw new Exception("ERR0001 - Id-ul orasului nu poate fi negativ");
		}
		
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(id).append( " " ).append( nume ).append( " " ).append(judet).append( " ").append( populatie);
		
		return sb.toString();
	}
}
