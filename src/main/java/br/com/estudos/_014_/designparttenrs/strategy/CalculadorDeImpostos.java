package br.com.estudos._014_.designparttenrs.strategy;
public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

      double valor = imposto.calcula(orcamento); 

      System.out.println(valor);

    }

}
