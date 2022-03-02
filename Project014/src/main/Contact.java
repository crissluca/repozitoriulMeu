package main;

public class Contact
{	
	//membri clasei Contact
	String nume;
	String prenume;
	
	String gender;
	
	//numere de telefon
	//adrese mail
	//adresa fizica
	//social media
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		//sb.append("nume=")   .append(nume)   .append("\n");
		//sb.append("prenume=").append(prenume).append("\n");
		//sb.append("gender=") .append(gender) .append("\n");
		
		sb.append(nume).append(" ").append(prenume).append(" ").append(gender);
		
		return sb.toString();
	}
}
