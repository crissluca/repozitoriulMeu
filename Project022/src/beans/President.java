package beans;

public class President extends Worker
{

	public President(String name) throws Exception
	{
		super(name);
	}

	@Override
	public void work()
	{
		System.out.println("Sign Decrete");
	}

}
