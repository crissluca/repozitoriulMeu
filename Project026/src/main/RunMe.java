package main;

import bean.InstrumentFinanciar;

public class RunMe
{

	public static void main(String[] args)
	{
		InstrumentFinanciar i1 = new InstrumentFinanciar();
		i1.setDenumire("Petrom");
		i1.setTip("actiune");
		i1.setISIN("ROSNPPACNOR9");
		InstrumentFinanciar i2 = new InstrumentFinanciar();
		i2.setDenumire("Azo Mures");
		i2.setTip("actiune");
		i2.setISIN("ROAZOMACNOR1");
		InstrumentFinanciar i3 = new InstrumentFinanciar();
		i3.setDenumire("Banca Transilvania");
		i3.setTip("actiune");
		i3.setISIN("ROTLVAACNOR1");
		
		InstrumenteFinanciareSecvential ifrs = new InstrumenteFinanciareSecvential(10);
		ifrs.add(i1);
		ifrs.add(i2);
		ifrs.add(i3);
		
		System.out.println( ifrs.search("ROAZOMACNOR1") );
		
		
		InstrumenteFinanciareSecventialArrayList ifrsal = new InstrumenteFinanciareSecventialArrayList();
		ifrsal.add(i1);
		ifrsal.add(i2);
		ifrsal.add(i3);
		
		System.out.println( ifrsal.search("ROAZOMACNOR1") );
		
		InstrumenteFinanciareHash ifrh = new InstrumenteFinanciareHash(10000);
		ifrh.put(i1);
		ifrh.put(i2);
		ifrh.put(i3);
		
		System.out.println( ifrh.get("ROAZOMACNOR1") );
		

	}

}
