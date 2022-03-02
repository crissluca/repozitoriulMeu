package beans;

public class Car extends Device
{
	public Car(String name, String sound, String description) throws Exception
	{
		super(name, sound, description);
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Car: ").append(name).append(" ").append(sound);
		
		return sb.toString();
	}

}
