package br.com.estudos._007_.oo.polimorfismo.test;

import br.com.estudos._007_.oo.polimorfismo.dominio.Computador;
import br.com.estudos._007_.oo.polimorfismo.dominio.Tomate;
import br.com.estudos._007_.oo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}