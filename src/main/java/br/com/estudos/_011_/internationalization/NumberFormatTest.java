package br.com.estudos._011_.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	public static void main(String[] args) {
		float valor = 123.4567f;
		Locale LocJP = new Locale("jp");
		Locale LocFr = new Locale("fr");
		
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(LocFr);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(LocFr);
		
		for(NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(valor));
	}
}
