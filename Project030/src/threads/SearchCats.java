package threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

import tools.GeneralTools;

public class SearchCats extends Thread
{
	Vector<String> files;
	
	GeneralTools gt = new GeneralTools();
	
	String path;
	
	String threadNumber;
	
	public SearchCats( String path )
	{
		this.path = path;
		
		threadNumber = path.substring( path.length()-3, path.length()-1);		
	}
	
	public void start()
	{
		//o folosim pentru a initializa diversi membri ai clasei mele
		
		System.out.println("	Thread "+ threadNumber + " is starting...");
		
		files = gt.scanPath( path );
		
		super.start();
	}
	
	@Override
	public void run()
	{
		System.out.println("	Thread "+ threadNumber + " is running...");
		
		for(int i=0; i<files.size();i++)
		{
			String fullFilePath = files.elementAt(i);
			
			System.out.println( "	Thread "+ threadNumber + " " + fullFilePath );
			
			try(BufferedReader br = new BufferedReader(new FileReader( fullFilePath )))
			{
				while( br.ready() )
				{
					br.read();
				}
			}
			catch(Exception ex)
			{
				System.out.println("	Thread "+ threadNumber + " Could not process file " + fullFilePath + " : " + ex);
			}	
		}
		System.out.println("	Thread "+ threadNumber + " ended");
	}

}
