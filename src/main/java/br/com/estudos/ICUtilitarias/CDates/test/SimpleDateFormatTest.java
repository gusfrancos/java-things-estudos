package br.com.estudos.ICUtilitarias.CDates.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Class SimpleDateFormat
 * 
 * Links: 
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html
 */
public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");

		// o que estiver em aspa simples vai se ignorado como comando e utilizado como  uma palavra no texto de saida
		SimpleDateFormat formatador2 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		SimpleDateFormat formatador3 = new SimpleDateFormat("'Brasília,' dd 'de' MMMM 'de' yyyy");

		System.out.println(formatador.format(c.getTime()));
		System.out.println(formatador2.format(c.getTime()));
		System.out.println(formatador3.format(c.getTime()));

	}

}
