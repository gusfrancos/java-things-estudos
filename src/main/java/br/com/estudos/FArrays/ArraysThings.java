package br.com.estudos.FArrays;


//o indice de um array sempre começa em 0
// o tamanho do array é o indice + 1
// toda vez que vc for criar o objeto array vc tem que passar o tamanho
// o colchete pode ser colocado antes ou depois do nome da variavel
//Array é sempre um objeto mesmo que seja um array de tipo primitivo
//se colocar mais de um colchete vira um array multidimenssional
//quando vc cria um array mesmo que não atribua ele jÃ¡ recebe um valor padrão


/**
 * 
 * Somente Vector e HashTable sÃ£o thread-safe
 *
 */




public class ArraysThings {

	// valor padrão para byte, short, int long float, double são igual a 0
	// valor padrão para char igual a '\u0000' representa um espaço vazio
	// valor padrão para boolean são igual a false
	// valor padrão para arrays de objeto será null

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
		// array já criado, vc perde todos valores atribuidos na referencia anterior
		nome = new String[4];

		// formas de inicializar
		int[] numeros = new int[5];
		int[] numeros2 = { 1, 2, 3, 4, 5 };
		int[] numeros3 = new int[] {1,2,3,4,5};

	}

}

//ExceÃ§Ã£o para tentar colocar um valor em um indice maior do que o que existe:
//ArrayIndexOutOfBoundsException;