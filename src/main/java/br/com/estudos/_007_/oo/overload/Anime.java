package br.com.estudos._007_.oo.overload;

public class Anime {
	private String tipo;
	private int episodios;
	private String nome;
	private String genero;
	
	//* Construtores não tém retorno
	// * this(); // chamando outro construtor da classe 
	// * Um construtor sÃ³ pode ser chamado dentro de outro construtor
	public Anime() {
		
	}
	
	
	public void imprime() {
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.nome);
		System.out.println(this.genero);
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
