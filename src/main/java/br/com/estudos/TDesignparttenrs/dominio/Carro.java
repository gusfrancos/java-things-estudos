package br.com.estudos.TDesignparttenrs.dominio;

public class Carro {
	 	private String marca;
	 	private String cor;
	 	private String placa;
	 	private Integer velocidadeAtual;
	 	private char marchaAtual;
	 	private Boolean freioDeMaoPuxado;
	 	private Boolean chaveVirada;
	 	private Integer numeroBancos;
	 	private Boolean temGPS;
	 	private Boolean temArCondicionado;
	 	private Boolean temVidroEletrico;
	 	
		 	
		public Boolean getTemVidroEletrico() {
			return temVidroEletrico;
		}
		public void setTemVidroEletrico(Boolean temVidroEletrico) {
			this.temVidroEletrico = temVidroEletrico;
		}
		public Boolean getTemArCondicionado() {
			return temArCondicionado;
		}
		public void setTemArCondicionado(Boolean temArCondicionado) {
			this.temArCondicionado = temArCondicionado;
		}
		public Boolean getTemGPS() {
			return temGPS;
		}
		public void setTemGPS(Boolean temGPS) {
			this.temGPS = temGPS;
		}
		public Integer getNumeroBancos() {
			return numeroBancos;
		}
		public void setNumeroBancos(Integer numeroBancos) {
			this.numeroBancos = numeroBancos;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public Integer getVelocidadeAtual() {
			return velocidadeAtual;
		}
		public void setVelocidadeAtual(Integer velocidadeAtual) {
			this.velocidadeAtual = velocidadeAtual;
		}
		public char getMarchaAtual() {
			return marchaAtual;
		}
		public void setMarchaAtual(char marchaAtual) {
			this.marchaAtual = marchaAtual;
		}
		public Boolean getFreioDeMaoPuxado() {
			return freioDeMaoPuxado;
		}
		public void setFreioDeMaoPuxado(Boolean freioDeMaoPuxado) {
			this.freioDeMaoPuxado = freioDeMaoPuxado;
		}
		public Boolean getChaveVirada() {
			return chaveVirada;
		}
		public void setChaveVirada(Boolean chaveVirada) {
			this.chaveVirada = chaveVirada;
		}
}