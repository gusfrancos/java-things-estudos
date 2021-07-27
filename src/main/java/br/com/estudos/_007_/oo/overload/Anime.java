package br.com.estudos._007_.oo.overload;

public class Anime {
	private String tipo;
	private int episodios;
	private String nome;
	private String genero;
	
	//* Construtores n�o t�m retorno
	// * this(); // chamando outro construtor da classe 
	// * Um construtor só pode ser chamado dentro de outro construtor
	public Anime() {
		
	}
	
	
	public void imprime() {
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.nome);
		System.out.println(this.genero);
	}
	
	/* Sobrecarga � a cria��o de v�rios m�todos com o mesmo nome dentro de uma mesma classe, 
	 * mas desde que estes m�todos tenham diferentes conjuntos de parametros, sejam eles n�meros, 
	 * simplesmente a ordem dos parametros ou ent�o tipos diferentes.*/
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
