package main;

import beans.Device;

public class Depozit
{
	int stoc;
	Device devices[] = new Device[100];
	
	public void addDevice(Device d)
	{
		devices[stoc++] = d;				
	}
}
