package br.com.estudos._007_.oo;

public class Carro {
	private String nome;
	private String placa;
	private String modelo;
	private double velocidadeMaxima;
	
	//uma variavel estatica é um membro da classe e se vc alterar o valor dela em uma instancia
	// todas as instancias da classe observará o valor modificado
	private static double velocidadeLimite = 240;
	
	
	public Carro() {
		super();
	}
	
	public Carro(String nome, double velocidadeMaxima) {
		super();
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	public void imprimir() {
		System.out.println("-------------------------------------------------");
		System.out.println(this.nome);
		System.out.println(this.velocidadeMaxima);
		//atributos staticos não precisam do this
		System.out.println(velocidadeLimite);
	}
	
	
	
	
	
	
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	public Carro(String nome, String placa, String modelo, double velocidadeMaxima, double velocidadeLimite) {
		super();
		this.nome = nome;
		this.placa = placa;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeLimite = velocidadeLimite;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the velocidadeMaxima
	 */
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	/**
	 * @param velocidadeMaxima the velocidadeMaxima to set
	 */
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	/**
	 * @return the velocidadeLimite
	 */
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	/**
	 * @param velocidadeLimite the velocidadeLimite to set
	 */
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	

}
