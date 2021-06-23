package br.com.estudos._010_.dates;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Class DateFormat
 * 
 * Link:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/DateFormat.html
 */
public class DateFormatTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getDateInstance();
		dfa[1] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[3] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[4] = DateFormat.getDateInstance(DateFormat.FULL);
		dfa[5] = DateFormat.getInstance();
		
		for(DateFormat df: dfa) {
			System.out.println(df.format(c.getTime()));
		}
	}
}
