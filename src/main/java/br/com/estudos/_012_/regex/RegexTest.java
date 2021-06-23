package br.com.estudos._012_.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pacote regex
 * 
 * Link:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/package-summary.html
 */
public class RegexTest {

	public static void main(String[] args) {
		String regexPatter = "ab";
		String texto = "abaaaaabaaab";
		Pattern pattern = Pattern.compile(regexPatter);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("Texto:  " + texto);
		System.out.println("Indice: 0123456789" );
		System.out.println("Expressão: " + matcher.pattern());
		System.out.println("Posições encontradas:");
		
		while(matcher.find()) {
			System.out.println(matcher.start() + " ");
		}
		
		
		
	}
}
