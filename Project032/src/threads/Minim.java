package threads;

public class Minim extends Algorithm
{
	@Override
	public void run()
	{
		int minim = 2147483647;
		for(int i=0;i<vg.n;i++)
		{
			if(vg.v[i] < minim )
			{
				minim = vg.v[i];
			}
		}
		
		vg.minim = minim;
	}
}
