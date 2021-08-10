package br.com.estudos._007_.oo.classes;

import br.com.estudos._007_.oo.abstratas.Estudante;
import br.com.estudos._007_.oo.statics.Carro;

// Classes são um moldes para criar objetos
// todas classes tem atributos e comportamentos
// Atributos: são as variaveis (váriaveis de instancia ou variaveis de classe)
// Comportamento: são os métodos
// vc não consegue instanciar uma classe de outro pacote sem import
// (a classe tem que ser mais coesa possivel..  
// uma classe coesa e especialista e tem atributos e métodos relacionados ao assunto
// para o qual ela foi criada)
public class ClassThings {
	public static void main(String[] args) {
		//instanciando classe
		//joao é uma variavel de referencia do tipo Estudante
		Estudante joao = new Estudante();
		
		//apartir da instancia voce pode acessar os atributos do objeto criado
		joao.nome = "João";
		joao.matricula = "12345";
		joao.idade = 21;
		
		//variaveis de classe recebem valor de inicializaÃ§Ã£o padrÃ£o
		// as de tipo reference recebe valor null e as de primitivo dentro da classe 
		// recebe valores padroes
		// (int, double, float, long recebe 0)
		// (Boolean recebe valor padrÃ£o false)
		// (char recebe um espaÃ§o em branco)
		
		Carro carro = new Carro();
		//carro.modelo = "Fusca";
		//carro.placa = "QWJ1029";
		//carro.velocidadeMaxima = 12;
	}
	
//	Coesão:
//	Coesão está, na verdade, ligado ao princípio da responsabilidade única, que foi introduzido por Robert C. Martin no inicio dos anos 2000 
//	e diz que uma classe deve ter apenas uma única responsabilidade e realizá-la de maneira satisfatória, ou seja, uma classe não deve assumir
//	responsabilidades que não são suas.


}
