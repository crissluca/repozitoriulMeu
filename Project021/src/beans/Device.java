package beans;

public class Device
{
	protected String name;
	protected String sound;
	protected String description;

	public Device(String name, String sound, String description) throws Exception
	{
		setName(name);
		
		this.sound = sound;
		
		this.description = description;
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
	
	public void sound()
	{
		System.out.println(sound);
	}
	
	public void show()
	{
		System.out.println(name);
	}
	
	public void desc()
	{
		System.out.println(description);
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Device : ").append(name).append(" ").append(sound);
		
		return sb.toString();
	}
}
