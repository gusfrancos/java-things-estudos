package br.com.estudos._014_.designparttenrs.chainofresponsability;

public interface Desconto {
	double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
