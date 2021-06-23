package br.com.estudos._009_.strings;

/**
 * 
 * @author gusfr
 * Literais de string são usados ​​a partir do pool de strings. Isso significa que s1 e s2 se referem ao
 * mesmo objeto e são iguais. Portanto, as duas primeiras instruções print imprimem true. O
 * a terceira instrução print imprime falsa porque toString () usa um método para calcular o
 * valor e não é do pool de strings. A declaração final de impressão novamente imprime verdadeira
 * porque equals () olha para os valores dos objetos String.
 */
public class Teste001 {
	
public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "Java";
	StringBuilder sb1 = new StringBuilder();
	sb1.append("Ja").append("va");
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	System.out.println(sb1.toString() == s1);
	System.out.println(sb1.toString().equals(s1));
	
	String String = "teste";
	String.substring(0, 3);
}

}
