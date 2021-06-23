package br.com.estudos._007_.oo;


/*
 * Sobrecarga é a criação de vários métodos com o mesmo nome dentro de uma mesma classe, 
 * mas desde que estes métodos tenham diferentes conjuntos de parâmetros, sejam eles números, 
 * simplesmente a ordem dos parâmetros ou então tipos diferentes.
 * 
 * Construtores não têm retorno
 * this(); // chamando outro construtor da classe 
 * Um construtor só pode ser chamado dentro de outro construtor
 */
public class ConstructorsAndOverloadThings {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.init("Chica", "45636354546464", 4500);
		funcionario.imprimir();
		
		funcionario.init("Chica", "45636354546464", 4500, "7464656");
		funcionario.imprimir();
		

	}

}
