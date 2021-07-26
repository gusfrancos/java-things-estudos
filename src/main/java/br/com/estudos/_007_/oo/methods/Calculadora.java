

package br.com.estudos._007_.oo.methods;


public class Calculadora {

	//no m�todo void voce pode passar o comando return vazio..  funciona como um break;
	//return;
	
	// comvencao nomes metodos
	// começa com letra minuscula e as seguintes palavras com a primeira maiuscula
	// primeira palavra é um verbo
	public void somarDoisNumeros(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	// para criar vc precisa definir um modificador de acesso, um tipo de retorno um
	// nome para o método e seus parametros
	public void subtrairDoisNumeros(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public void multiplicarDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// pode-se usar return sem valor em método void para
	// para sair do método (tipo um break para método)
	public void calcularRestoDivisao(int num1, int num2) {
		System.out.println(num1 % num2);
		return;
	}

	public double dividirDoisNumeros(double dividendo, double divisor) {
		if (divisor > 0) {
			return (dividendo / divisor);
		}
		return 0;
	}
	
	//VarArgs
	//posso passar um array neste varargs
	//posso passar os valores separados por virgula
	// só pode ter um varargs por método
	//posso ter uma variavel com um varargs, mas o varargs tem que ser o ultimo
	public void somaComVarArgs(int teste, int... numeros) {
		int soma = 0;
		for(int num : numeros) {
			soma += num;
		}
		
		System.out.println(soma);
	}
	
	
	public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+numero1);
        System.out.println("Num2 "+numero2);
    }

}
