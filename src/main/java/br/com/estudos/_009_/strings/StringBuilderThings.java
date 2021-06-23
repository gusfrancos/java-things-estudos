package br.com.estudos._009_.strings;

public class StringBuilderThings {
	// Stringbuilder são mutaveis
	//StringBuilders é uma final class e implicitamente todos os seus métodos são
	// construtores do string builder com inteiro garamtem a capacidade minima do stringbuilder
	//Ex. StringBuilder sb = new StringBuilder(100); garante 100
	// se não tiver nada no construtor garate 16
	
	//SB não extende a classe String somente extende Object

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a = 98;
		
		System.out.println(new StringBuilder("teste").replace(0, 1, "bl"));

	}
	

	
	/*
	//métodos
	length - Retorna o número de caracteres atualmente em um StringBuilder;

	capacity – Retorna o número de caracteres que pode ser armazenado em um StringBuilder sem alocar mais memória;

	ensureCapacity – Garante que um StringBuilder tenha pelo menos a capacidade especificada;

	setLength – Aumenta ou diminui o comprimento de uma StringBuilder;

	charAt – Aceita um argumento inteiro que representa o índice e retorna o caractere nessa posição no StringBuilder;

	setCharAt – Copia caracteres de um StringBuilder no array de caracteres passado como um argumento, tendo aceitação de até 4 argumentos;

	o índice inicial a partir do qual os caractere(s) devem ser copiados do StringBuilder;
	o índice um a mais do último caractere que será copiado a partir do StringBuilder;
	o array de caracteres para onde os caracteres serão copiados;
	localização inicial no array de caracteres em que o primeiro caractere deve ser colocado;
	getChars – Retorna o caractere especificado;

	reverse – Retorna os caracteres invertidos;
	
	Método insert
	Os métodos insert sobrecarregados inserem valores de vários tipos (primitivos, arrays de caracteres, Strings, Objects e CharSequences) em qualquer posição de um StringBuilder.

	Existem alguns cuidados nesses tipos de operação, pois se inserir um número maior que um comprimento da StringBuilder ou menor que 0, irá estourar uma exceção StringIndexOutBoundsException.
	
	
	Método delete */
}
