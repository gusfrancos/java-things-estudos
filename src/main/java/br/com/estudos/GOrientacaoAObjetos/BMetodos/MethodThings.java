package br.com.estudos.GOrientacaoAObjetos.BMetodos;

public class MethodThings {

	// comvencao nomes metodos
	// começa com letra minuscula e as seguintes palavras com a primeira maiuscula
	// primeira palavra é um verbo
	// para criar vc precisa definir um modificador de acesso, um tipo de retorno um
	// nome para o método e seus parametros

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		// calc.somarDoisNumeros(1,2);

		// calc.subtrairDoisNumeros(5, 2);

		// calc.multiplicarDoisNumeros(3, 2);

		calc.calcularRestoDivisao(0, 3);
		calc.calcularRestoDivisao(1, 3);
		calc.calcularRestoDivisao(2, 3);
		calc.calcularRestoDivisao(3, 3);
		calc.calcularRestoDivisao(4, 3);

		// calc.calcularRestoDivisao(5,7);

		// calc.calcularRestoDivisao(1,3);
		// calc.calcularRestoDivisao(2,3);

		// calc.somaComVarArgs(1,2,3,4,5);

		// System.out.println(calc.dividirDoisNumeros(20, 0));

	}

}
