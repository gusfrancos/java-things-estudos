package br.com.estudos._005_.fluxcontrol;

public class Exerc0001 {

	public static void main(String[] args) {
		int salario = 3456;
		
		
		
		if (salario < 1000) {
			System.out.println("Imposto:" + (salario * 0.05));
		} else if ( salario >= 1000 && salario < 2000) {
			System.out.println("Imposto:" + (salario * 0.1));
		} else if ( salario >= 2000 && salario < 5000) {
			System.out.println("Imposto:" + (salario * 0.15));
		} else if ( salario > 5000 ) {
			System.out.println("Imposto:" + (salario * 0.2));
		}
		
		

	}

}
