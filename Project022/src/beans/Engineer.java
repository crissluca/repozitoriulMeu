package beans;

public class Engineer extends Worker
{

	public Engineer(String name) throws Exception
	{
		super(name);
	}

	@Override
	public void work()
	{
		System.out.println("Foloseste o aplicatie CAD pentru a proiecta ceva");
	}

}
