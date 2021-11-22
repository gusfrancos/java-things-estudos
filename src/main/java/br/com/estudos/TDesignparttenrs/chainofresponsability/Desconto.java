package br.com.estudos.TDesignparttenrs.chainofresponsability;

public interface Desconto {
	double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
