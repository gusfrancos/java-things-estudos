package br.com.estudos.GOrientacaoAObjetos.construtores;

public class Anime {
	private String tipo;
	private int episodios;
	private String nome;
	private String genero;
	private String estudio;
	
	//* Construtores não tém retorno
	// * this(); // chamando outro construtor da classe 
	// outro construtor só pode ser chamado dentro do corpo de um construtor
	public Anime(String tipo, String nome, int episodios, String genero) {
		//em um construtor para chamar outro construtor você só precisa escrever this();
		this();
		System.out.println("Dentro do construtor com 4 argumentos");
		this.init(tipo, nome, episodios, genero);
	}
	
	public Anime(String tipo, String nome, int episodios, String genero, String estudio) {
		//em um construtor para chamar outro construtor você só precisa escrever this();
		this(tipo, nome, episodios, genero);
		System.out.println("Dentro do construtor com 5 argumentos");
		this.estudio = estudio;
		this.init(tipo, nome, episodios, genero);
	}
	
	
	
	
	//sobrecarga de construtores
	public Anime() {
		System.out.println("Dentro do construtor sem argumentos");
	}
	
	
	public void imprime() {
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.nome);
		System.out.println(this.genero);
		System.out.println(this.estudio);
	}
	
	/* Sobrecarga é a criação de vários métodos com o mesmo nome dentro de uma mesma classe, 
	 * mas desde que estes métodos tenham diferentes conjuntos de parametros, sejam eles números, 
	 * simplesmente a ordem dos parametros ou então tipos diferentes.*/
	public void init(String tipo, String nome, int episodios) {
		this.tipo = tipo;
		this.nome = nome;
		this.episodios = episodios;
		
	}
	
	public void init(String tipo, String nome, int episodios, String genero) {
		this.init(tipo, nome, episodios);
		this.genero = genero;
	}
	
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
}
