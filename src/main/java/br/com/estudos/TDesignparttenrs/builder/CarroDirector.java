package br.com.estudos.TDesignparttenrs.builder;

public class CarroDirector {
	public ICarroBuilder construirCarroAutomatico(ICarroBuilder builder) {
		builder.acelerarAte(300);
		builder.mudarMarcha('0');
		builder.numeroBancos(4);
		builder.temVidroEletrico(false);
		builder.desligar();
		return builder;
	}

	public ICarroBuilder construirCarroManual(ICarroBuilder builder) {
		builder.acelerarAte(350);
		builder.mudarMarcha('1');
		builder.numeroBancos(5);
		builder.temArCondicionado(false);
		return builder;
	}
}
