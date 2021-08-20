package br.com.estudos.FArrays;


//o indice de um array sempre come�a em 0
// o tamanho do array � o indice + 1
// toda vez que vc for criar o objeto array vc tem que passar o tamanho
// o colchete pode ser colocado antes ou depois do nome da variavel
//Array � sempre um objeto mesmo que seja um array de tipo primitivo
//se colocar mais de um colchete vira um array multidimenssional
//quando vc cria um array mesmo que n�o atribua ele já recebe um valor padr�o


/**
 * 
 * Somente Vector e HashTable são thread-safe
 *
 */




public class ArraysThings {

	// valor padr�o para byte, short, int long float, double s�o igual a 0
	// valor padr�o para char igual a '\u0000' representa um espa�o vazio
	// valor padr�o para boolean s�o igual a false
	// valor padr�o para arrays de objeto ser� null

	public static void main(String[] args) {
		
		//Array de tipo primitivo
		int[] idade = new int[3];
		int idade2[];

		idade[0] = 20;
		idade[1] = 15;
		idade[2] = 30;

		// Array de objeto
		String[] nome = new String[3];
		nome[0] = "Naruto";
		nome[1] = "Goku";
		nome[2] = "Luffy";

		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}

		// se vc criar uma nova referencia para o
		// array j� criado, vc perde todos valores atribuidos na referencia anterior
		nome = new String[4];

		// formas de inicializar
		int[] numeros = new int[5];
		int[] numeros2 = { 1, 2, 3, 4, 5 };
		int[] numeros3 = new int[] {1,2,3,4,5};

	}

}

//Exceção para tentar colocar um valor em um indice maior do que o que existe:
//ArrayIndexOutOfBoundsException;