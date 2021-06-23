package br.com.estudos._007_.oo;

//classe é um molde para criar objetos
//todas classes tem atributos e comportamentos
// Atributos: são as váriaveis (váriaveis de instancia ou variavéis de classe)
// Comportamento: são os métodos
// vc não consegue instanciar uma classe de outro pacote sem import
// (a classe tem que ser mais coesa possivel..  
// uma classe coesa é especialista e tem atributos e métodos relacionados ao assunto
// para o qual ela foi criada)
public class ClassThings {
	public static void main(String[] args) {
		//instanciando classe
		//joao é uma variavel de referência do tipo Estudante
		Estudante joao = new Estudante();
		
		//apartir da instancia você pode acessar os atributos do objeto criado
		joao.nome = "João";
		joao.matricula = "12345";
		joao.idade = 21;
		
		//variaveis de classe recebem valor de inicialização padrão
		// as de tipo reference recebe valor null e as de primitivo dentro da classe 
		// recebe valores padroes
		// (int, double, float, long recebe 0)
		// (Boolean recebe valor padrão false)
		// (char recebe um espaço em branco)
		
		Carro carro = new Carro();
		//carro.modelo = "Fusca";
		//carro.placa = "QWJ1029";
		//carro.velocidadeMaxima = 12;
		
		
		
	}
	
}
