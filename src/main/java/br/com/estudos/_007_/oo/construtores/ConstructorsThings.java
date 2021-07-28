package br.com.estudos._007_.oo.construtores;

import br.com.estudos._007_.oo.modifiers.Funcionario;

/*
 * Sobrecarga é a criação de vários métodos com o mesmo nome dentro de uma mesma classe, 
 * mas desde que estes métodos tenham diferentes conjuntos de parametros, sejam eles números, 
 * simplesmente a ordem dos parametros ou então tipos diferentes.
 * 
 * Construtores não tém retorno
 * this(); // chamando outro construtor da classe 
 * Um construtor sÃ³ pode ser chamado dentro de outro construtor
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
