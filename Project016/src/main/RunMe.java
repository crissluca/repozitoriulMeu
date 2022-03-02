package main;

import java.util.Scanner;

import beans.Person;

public class RunMe
{

	
	public static void main(String[] args)
	{
		Person p1 = new Person("Han", "Valentin");
		//System.out.println("Pana acum au fost create " + p1.cate + " obiecte ale clasei Person");
		//System.out.println("Pana acum au fost create " + Person.cate + " obiecte ale clasei Person");
		System.out.println("Pana acum au fost create " + Person.getHowManyObjects() + " obiecte ale clasei Person");
	
		Person p2 = new Person("Nitu", "Bianca");
		//System.out.println("Pana acum au fost create " + p2.cate + " obiecte ale clasei Person");
		//System.out.println("Pana acum au fost create " + Person.cate + " obiecte ale clasei Person");
		System.out.println("Pana acum au fost create " + Person.getHowManyObjects() + " obiecte ale clasei Person");
		
		Person p3 = new Person("Ionita", "Costin");
		//System.out.println("Pana acum au fost create " + p3.cate + " obiecte ale clasei Person");
		//System.out.println("Pana acum au fost create " + Person.cate + " obiecte ale clasei Person");
		System.out.println("Pana acum au fost create " + Person.getHowManyObjects() + " obiecte ale clasei Person");		
		
		Person p4 = new Person("Luca", "Stefan");
		//System.out.println("Pana acum au fost create " + p4.cate + " obiecte ale clasei Person");
		//System.out.println("Pana acum au fost create " + Person.cate + " obiecte ale clasei Person");
		System.out.println("Pana acum au fost create " + Person.getHowManyObjects() + " obiecte ale clasei Person");
	}

}
