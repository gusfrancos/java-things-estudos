package br.com.estudos.TDesignparttenrs.builder;

import br.com.estudos.TDesignparttenrs.dominio.Carro;

public class AppCarroBuilder {
	public static void main(String[] args) {
		CarroDirector carroDirector = new CarroDirector();
		CarroAutomaticoBuilder builder = new CarroAutomaticoBuilder();
		carroDirector.construirCarroAutomatico(builder);
		Carro carro = builder.getProduct();

	}
}
