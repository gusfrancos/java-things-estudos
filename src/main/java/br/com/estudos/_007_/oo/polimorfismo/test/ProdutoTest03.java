package br.com.estudos._007_.oo.polimorfismo.test;

import br.com.estudos._007_.oo.polimorfismo.dominio.Computador;
import br.com.estudos._007_.oo.polimorfismo.dominio.Produto;
import br.com.estudos._007_.oo.polimorfismo.dominio.Tomate;
import br.com.estudos._007_.oo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
