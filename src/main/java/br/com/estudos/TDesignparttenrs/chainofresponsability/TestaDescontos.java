package br.com.estudos.TDesignparttenrs.chainofresponsability;

public class TestaDescontos {
    public static void main(String[] args) {
      CalculadorDeDescontos calculador = new CalculadorDeDescontos();

          Orcamento orcamento = new Orcamento(500.0);
          orcamento.adicionaItem(new Item("CANETA", 250.0));
          orcamento.adicionaItem(new Item("LAPIS", 250.0));

          double desconto = calculador.calcula(orcamento);

          System.out.println(desconto);

    }
  }
