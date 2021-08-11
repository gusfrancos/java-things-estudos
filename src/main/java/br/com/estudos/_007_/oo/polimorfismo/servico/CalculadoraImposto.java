package br.com.estudos._007_.oo.polimorfismo.servico;

import br.com.estudos._007_.oo.polimorfismo.dominio.Computador;
import br.com.estudos._007_.oo.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relat�rio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relat�rio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }
}