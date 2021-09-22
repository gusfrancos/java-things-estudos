package br.com.estudos.ICUtilitarias.ERegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pacote regex
 * 
 * Link:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/package-summary.html
 * https://www.devmedia.com.br/conceitos-basicos-sobre-expressoes-regulares-em-java/27539
 */
public class MetaCaracteresTest {

	public static void main(String[] args) {
		//Lista:
		//  (.) - Busca qualquer caracter
		//  (\\d) - Busca qualquer número
		//  (\\D) - Busca qualquer caracter que não seja numero
		//  (\\w) - Busca qualquer caracter de letra ou números  [a-z A-Z
		//  (\\W) - Busca qualquer caracter que não sejam letra ou números
		//  (\\s) - Busca qualquer caracter de espaço em branco ou tabulações (\t \n \f \r)
		//  (\\S) - Busca qualquer caracter que não sejam letra ou números 

//Quantificadores:
		//  ? - zero ou uma ocorrência
		//  * - zero ou mais ocorrências
		//  + - uma ou mais ocorrências
		//  (n,m) de n até m ocorrências

// outros simbolos:
		// [] - 
		// () - serve para agrupar
		// |  - serve para colocar OU
		// $  - indica fim de linha
		// . - Caracter coringa Ex (1.3) = 123, 133,1A3
		// ^ - Caracter de negação.  Ex [^abc] - quero qualquer coisa que não seja abc
			
		String regexPatter = "\\D";
		String texto = "hjfdf7df677hdjhf8fjf84hd63hd";
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
