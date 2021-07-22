package br.com.estudos._007_.oo.classes;

import br.com.estudos._007_.oo.Carro;
import br.com.estudos._007_.oo.Estudante;

// Classes s„o um moldes para criar objetos
// todas classes tem atributos e comportamentos
// Atributos: s„o as variaveis (v·riaveis de instancia ou variaveis de classe)
// Comportamento: s„o os mÈtodos
// vc n„o consegue instanciar uma classe de outro pacote sem import
// (a classe tem que ser mais coesa possivel..  
// uma classe coesa e especialista e tem atributos e mÈtodos relacionados ao assunto
// para o qual ela foi criada)
public class ClassThings {
	public static void main(String[] args) {
		//instanciando classe
		//joao È uma variavel de referencia do tipo Estudante
		Estudante joao = new Estudante();
		
		//apartir da instancia voce pode acessar os atributos do objeto criado
		joao.nome = "Jo„o";
		joao.matricula = "12345";
		joao.idade = 21;
		
		//variaveis de classe recebem valor de inicializa√ß√£o padr√£o
		// as de tipo reference recebe valor null e as de primitivo dentro da classe 
		// recebe valores padroes
		// (int, double, float, long recebe 0)
		// (Boolean recebe valor padr√£o false)
		// (char recebe um espa√ßo em branco)
		
		Carro carro = new Carro();
		//carro.modelo = "Fusca";
		//carro.placa = "QWJ1029";
		//carro.velocidadeMaxima = 12;
		
		
		
		
	}
	
}
