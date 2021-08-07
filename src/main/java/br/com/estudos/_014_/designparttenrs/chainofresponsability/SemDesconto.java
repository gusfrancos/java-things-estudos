package br.com.estudos._014_.designparttenrs.chainofresponsability;

public class SemDesconto implements Desconto {

    public double desconta(Orcamento orcamento) {
        return 0;
    }

    public void setProximo(Desconto desconto) {
        // nao tem!
    }
}