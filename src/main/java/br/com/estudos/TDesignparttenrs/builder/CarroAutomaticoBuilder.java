package br.com.estudos.TDesignparttenrs.builder;

import br.com.estudos.TDesignparttenrs.dominio.Carro;

public class CarroAutomaticoBuilder implements ICarroBuilder {
	private Carro carro;
	
	CarroAutomaticoBuilder() {
		this.reset();
	}

	public void reset() {
		this.carro = new Carro();
	}

	@Override
	public void ligar() {
		this.carro.setChaveVirada(true);
		this.carro.setVelocidadeAtual(0);
	}

	@Override
	public void desligar() {
		this.carro.setChaveVirada(false);
		this.carro.setVelocidadeAtual(0);
		this.carro.setFreioDeMaoPuxado(true);
	}

	@Override
	public void acelerarAte(Integer velocidade) {
		this.carro.setFreioDeMaoPuxado(false);
		this.carro.setVelocidadeAtual(velocidade);
	}

	@Override
	public void mudarMarcha(char marcha) {
		this.carro.setMarchaAtual(marcha);
	}

	@Override
	public void parar() {
		this.carro.setVelocidadeAtual(0);
		this.carro.setFreioDeMaoPuxado(true);
	}

	@Override
	public void numeroBancos(Integer numero) {
		this.carro.setNumeroBancos(numero);
	}

	@Override
	public void temGPS(boolean tem) {
		this.carro.setTemGPS(tem);
	}

	@Override
	public void temArCondicionado(boolean tem) {
		this.carro.setTemArCondicionado(tem);
	}

	@Override
	public void temVidroEletrico(boolean tem) {
		this.carro.setTemVidroEletrico(tem);
	}
	
	public Carro getProduct() {
		this.reset();
		return this.carro;
		
	}
}
