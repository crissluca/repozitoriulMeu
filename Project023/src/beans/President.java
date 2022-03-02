package beans;

public class President extends Worker implements Conducere, Board
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

	@Override
	public String raport()
	{		
		return "Anual";
	}

}
