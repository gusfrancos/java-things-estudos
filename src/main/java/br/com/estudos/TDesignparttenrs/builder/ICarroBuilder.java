package br.com.estudos.TDesignparttenrs.builder;

public interface ICarroBuilder {
	public void ligar();
	public void desligar();
	public void acelerarAte(Integer velocidade);
	public void mudarMarcha(char marcha);
	public void parar();
	public void numeroBancos(Integer numero);
	public void temGPS(boolean tem);
	public void temArCondicionado(boolean tem);
	public void temVidroEletrico(boolean tem);
}


