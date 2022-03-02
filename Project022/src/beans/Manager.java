package beans;

public class Manager extends Worker
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

}
