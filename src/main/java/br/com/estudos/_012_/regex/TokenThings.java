package br.com.estudos._012_.regex;

public class TokenThings {

	public static void main(String[] args) {
		String str = "Willian, Gustavo, Andreia, Paulo, Joana, Camila, Anna, Jonh, Matheus";
		//pode colocar qualquer delimitador, inclusive expressoes regulares
		String regex = ",";
		String[] tokens = str.split(regex);
		for(String arr: tokens) {
			System.out.println(arr.trim());
		}
	}

}
