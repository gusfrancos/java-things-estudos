package br.com.estudos.ICUtilitarias.CDates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale l = new Locale("it");
		Locale l2 = new Locale("it","CH");
		Locale l3 = new Locale("hi", "IN");
		Locale l4 = new Locale("ja");
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, l);
		System.out.println(df.format(c.getTime()));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, l2);
		System.out.println(df2.format(c.getTime()));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, l3);
		System.out.println(df3.format(c.getTime()));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, l4);
		System.out.println(df4.format(c.getTime()));
		
		
		System.out.println(l3.getDisplayCountry());

	}

}
