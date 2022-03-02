package threads;

public class Maxim extends Algorithm
{
	@Override
	public void run()
	{
		int maxim = -2147483648;
		for(int i=0;i<vg.n;i++)
		{
			if(vg.v[i] > maxim )
			{
				maxim = vg.v[i];
			}
		}
		
		vg.maxim = maxim;
	}
}
