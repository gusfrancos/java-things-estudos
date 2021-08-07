package br.com.estudos._014_.designparttenrs.strategy;

public class ICMS implements Imposto {

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}
