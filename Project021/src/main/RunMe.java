package main;

import beans.Car;
import beans.Device;
import beans.Kettle;

public class RunMe
{

	public static void main(String[] args)
	{
		Device d = null;
		
		try
		{
			d = new Device("TV", "fhhsss", "LG");
			System.out.println(d);
			
			d.sound();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		Kettle k = null;
		
		try
		{
			k = new Kettle("Xiaomi", "ssssss", "Black, Bluetooth connected");
			System.out.println(k);
			
			k.sound();
			k.show();
			k.desc();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		Car c = null;
		
		try
		{
			c = new Car("Bmw", "vrummm", "Red");
			System.out.println(c);
			
			c.sound();
			c.show();
			c.desc();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		Depozit depozitCorbeanca = new Depozit();
		
		depozitCorbeanca.addDevice(c);
		depozitCorbeanca.addDevice(k);

	}

}

