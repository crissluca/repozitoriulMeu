package beans;

import beans.Worker;
import main.HR;

public class HumanResource extends Worker
{
	//o referinta a clasei HR pentru a face efectiv angajarea
	HR hr;
	
	public HumanResource(String name) throws Exception
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void setHR(HR hr)
	{
		this.hr = hr;
	}
	
	//DESIGN PATTERN Factory Method 
	
	@Override
	public void work()
	{
		System.out.println("Ce tip de angajat ?");
		
		
		//hr.hire(e);
	}
}
