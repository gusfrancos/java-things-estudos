package br.com.estudos._004_1.condicionais;

public class OperadorTernario {
	public static void main(String[] args) {
		double salario = 6000;
		String mensagemDoar = "Eu vou doar 500 pro DevDojo";
		String mensagemNaoDoar = "N�o posso doar, ainda!";
		
		//(condi�ao) ? verdadeiro : falso
		String resultado = salario >= 6000 ? mensagemDoar:mensagemNaoDoar;
		
		System.out.println(resultado);
		
	}
	
	
	

}
