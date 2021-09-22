package br.com.estudos.ICUtilitarias.ERegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pacote regex
 * Class ExpressoesRegularesThings
 * 
 * Link:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/package-summary.html
 * https://www.devmedia.com.br/conceitos-basicos-sobre-expressoes-regulares-em-java/27539
 */
public class ExpressoesRegularesThings {

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
				// . - Caracter coringa Ex (1.3) = 123, 133,1A3,
		String regex = "[a-cA-C]";
		String texto = "cafeBABE";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("Texto:  " + texto);
		System.out.println("Indice: 0123456789" );
		System.out.println("Expressão: " + matcher.pattern());
		System.out.println("Posições encontradas:");
		
		while(matcher.find()) {
			System.out.println(matcher.start() + " ");
		}
		
		System.out.println(" ****************************** ");
		
		// Regex para saber se é um número hexadecimal
		regex = "0[Xx][0-9A-Fa-f]*\\s|$";
		texto = "12 0x 0X 0xFFABC 0x10G 0x1";
		Pattern pattern2 = Pattern.compile(regex);
		Matcher matcher2 = pattern2.matcher(texto);
		
		System.out.println("Texto:  " + texto);
		System.out.println("Indice: 0123456789" );
		System.out.println("Expressão: " + matcher2.pattern());
		System.out.println("Posições encontradas:");
		
		while(matcher2.find()) {
			System.out.println(matcher2.start() + " " + matcher2.group());
		}
		
		
		
		
		System.out.println(" ****************************** ");
		
		//Expressão regular para saber se e´um email 
		
		regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z0-9])+(\\.([a-zA-Z0-9])+)+";
		texto = "fulano@gmail.com, 102Abc@hotmail.com, #$%abo@mail, teste@gmail.br, teste@mail, bb@face.com.br";
		Pattern pattern3 = Pattern.compile(regex);
		Matcher matcher3 = pattern3.matcher(texto);
		
		System.out.println("Texto:  " + texto);
		System.out.println("Indice: 0123456789" );
		System.out.println("Expressão: " + matcher3.pattern());
		System.out.println("Posições encontradas:");
		
		while(matcher3.find()) {
			System.out.println(matcher3.start() + " " + matcher3.group());
		}
		
		System.out.println(" ****************************** ");
		
		//Usar uma expressão regular para validar um texto
		//forma 1
		//regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z0-9])+(\\.([a-zA-Z0-9])+)+";
		//forma 2
		regex = "([\\w\\.])+@([a-zA-Z0-9])+(\\.([a-zA-Z0-9])+)+";
		
		
		System.out.println("Email válido:" + "teste@mail".matches(regex));
		System.out.println("Email válido:" + "fulano@gmail.com".matches(regex));
		
		
		System.out.println(" ****************************** ");
		//Usar uma expressão regular para validar uma data
		
		regex = "\\d{2}/\\d{2}/\\d{2,4}";
		texto = "05/10/2010 05/5/2015 03/03/2003 1/1/01 01/05/95"; // validar dd/MM/yyyy
		Pattern pattern4 = Pattern.compile(regex);
		Matcher matcher4 = pattern4.matcher(texto);
		
		System.out.println("Texto:  " + texto);
		System.out.println("Indice: 0123456789" );
		System.out.println("Expressão: " + matcher4.pattern());
		System.out.println("Posições encontradas:");
		
		while(matcher4.find()) {
			System.out.println(matcher4.start() + " " + matcher4.group());
		}
		
		
		
		
		
	}
}
