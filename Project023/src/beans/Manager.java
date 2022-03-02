package beans;

public class Manager extends Worker implements Conducere
{

	public Manager(String name) throws Exception
	{
		super(name);
	}

	@Override
	public void work()
	{		
		System.out.println("Management");
	}

	@Override
	public String raport()
	{
		// TODO Auto-generated method stub
		return "Lunar";
	}

}
