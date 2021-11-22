package br.com.estudos.TDesignparttenrs.dominio;

public class Carro {
	 	private String marca;
	 	private String cor;
	 	private String placa;
	 	private Integer velocidadeAtual;
	 	private char marchaAtual;
	 	private Boolean freioDeMaoPuxado;
	 	private Boolean chaveVirada;
	 	
		public Carro(String marca, String cor, String placa, Integer velocidadeAtual, char marchaAtual,
				Boolean freioDeMaoPuxado, Boolean chaveVirada) {
			super();
			this.marca = marca;
			this.cor = cor;
			this.placa = placa;
			this.velocidadeAtual = velocidadeAtual;
			this.marchaAtual = marchaAtual;
			this.freioDeMaoPuxado = freioDeMaoPuxado;
			this.chaveVirada = chaveVirada;
		}

		@Override
		public String toString() {
			return "Carro [marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", velocidadeAtual="
					+ velocidadeAtual + ", marchaAtual=" + marchaAtual + ", freioDeMaoPuxado=" + freioDeMaoPuxado
					+ ", chaveVirada=" + chaveVirada + "]";
		}
}