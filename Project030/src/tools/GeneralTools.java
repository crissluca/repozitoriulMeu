package tools;

import java.io.File;
import java.util.Vector;

public class GeneralTools
{
	public Vector<String> scanPath(String path)
	{
		Vector<String> listaFisiereDinCale = new Vector<>();		
		
		scanSubFolder( new File( path ) , listaFisiereDinCale );
		
		return listaFisiereDinCale;
	}
	
	public void scanSubFolder( File folderObject, Vector<String> listaFisiereDinCale )
	{
		File[] folderObjects; 
		
		if( folderObject.isDirectory() )
		{
			folderObjects = folderObject.listFiles();
			
			if(folderObjects != null)
			{
				for(int i=0;i<folderObjects.length;i++)
				{
					if( folderObjects[i].isFile() )
					{
						listaFisiereDinCale.add( folderObjects[i].getPath() );
					}
					else if( folderObjects[i].isDirectory())
					{
						scanSubFolder( new File( folderObjects[i].getPath() ) , listaFisiereDinCale );
					}
					else
					{
						System.out.println("Oooops we are far in the future. New folder object invented !!");
					}
				}
			}
		}
	}
}
