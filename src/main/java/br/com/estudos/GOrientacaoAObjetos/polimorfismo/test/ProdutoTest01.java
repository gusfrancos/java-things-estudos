package br.com.estudos.GOrientacaoAObjetos.polimorfismo.test;

import br.com.estudos.GOrientacaoAObjetos.polimorfismo.dominio.Computador;
import br.com.estudos.GOrientacaoAObjetos.polimorfismo.dominio.Televisao;
import br.com.estudos.GOrientacaoAObjetos.polimorfismo.dominio.Tomate;
import br.com.estudos.GOrientacaoAObjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}