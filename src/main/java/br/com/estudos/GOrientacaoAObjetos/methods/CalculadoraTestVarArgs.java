package br.com.estudos.GOrientacaoAObjetos.methods;

public class CalculadoraTestVarArgs {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		int[] numeros = {1,2,3,4,5,6};
		calculadora.somaComVarArgs(0, numeros);
		
		calculadora.somaComVarArgs(0, 4,6,7,8,9);
		
	}

}
