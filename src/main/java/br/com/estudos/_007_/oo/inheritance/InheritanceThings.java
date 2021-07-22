package br.com.estudos._007_.oo.inheritance;

import br.com.estudos._007_.oo.Pessoa;

/**Não existe multipla herança em java
 * 
 * Sobrescrita de métodos (override): 
 *
 */


//Etapas da inacialização de um objeto com herança
	// 1 - Aloca espaço na memória para o objeto que será criado
	// 2 - Cada atributo de classe é inicializado com seus valores default 
	// 3 - O construtor da  superclasse é chamado
    // 4 - A inicialização dos atributos via declaração e o código do bloco de inicialização da superclasse são executados na ordem 
    //     que aparecem
	// 5 - O código do construtor da superclasse é chamado
    // 6 - Passo 4 é executado para subclasse
	// 7 - o construtor  da classe é executado


// * - Bloco de inicialização estatico é executado antes de qualquer coisa e só roda uma vez quando a classe for carregada
//pela primeira vês

public class InheritanceThings {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Gina");
		p.setCpf("434343434343434");
		Endereco e = new Endereco();
		e.setBairro("Bairro:");
		e.setRua("Rua: 25");
		p.setEndereco(e);
		p.imprimir();
		
		//------------------------
		
		Funcionario  f = new Funcionario();
		f.setNome("GuGu");
		f.setCpf("23434354545454");
		Endereco e1 = new Endereco();
		e1.setBairro("fddfdddfd");
		e1.setRua("Rua: 24");
		f.setEndereco(e1);
		f.setSalario(150000);
		f.imprimir();
		
		
		
		
	}
}
