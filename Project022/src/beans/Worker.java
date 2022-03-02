package beans;

public abstract class Worker
{
	protected String name;

	public Worker(String name) throws Exception
	{
		setName(name);
	}
	
	public void setName(String name) throws Exception
	{
		if(name != null && name.length() > 1 )
		{
			this.name = name;
		}
		else
		{
			throw new Exception("ERR0001 - Invalid name for a device " + name);
		}
	}
	
	public abstract void work(); //am doar antetul
	
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		
		return sb.toString();
	}
}
