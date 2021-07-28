package br.com.estudos._007_.oo.construtores;

import br.com.estudos._007_.oo.modifiers.Funcionario;

/*
 * Sobrecarga � a cria��o de v�rios m�todos com o mesmo nome dentro de uma mesma classe, 
 * mas desde que estes m�todos tenham diferentes conjuntos de parametros, sejam eles n�meros, 
 * simplesmente a ordem dos parametros ou ent�o tipos diferentes.
 * 
 * Construtores n�o t�m retorno
 * this(); // chamando outro construtor da classe 
 * Um construtor só pode ser chamado dentro de outro construtor
 */
public class ConstructorsThings {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.init("Chica", "45636354546464", 4500);
		funcionario.imprimir();
		
		funcionario.init("Chica", "45636354546464", 4500, "7464656");
		funcionario.imprimir();
		

	}

}
