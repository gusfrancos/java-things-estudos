package br.com.estudos.FArrays;

public class ArrayForEach {

	public static void main(String[] args) {
		int[] numeros = new int[] {1,2,3,4,5};
		String nomes [] = {"Pedro", "João", "Carla"};
		
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		for (String nome : nomes){
			System.out.println(nome);
		}

	}

}
