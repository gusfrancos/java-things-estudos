package br.com.estudos.ICUtilitarias.CDates.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
	public static void main(String[] args) {
		Date date = new Date();
		date.setTime(date.getTime() + 3600000L);
		System.out.println(date);
		
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		Date date2 = c.getTime();
		System.out.println(date2);
		
		
	}
}
