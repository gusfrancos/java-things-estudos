package br.com.estudos.GOrientacaoAObjetos.polimorfismo.servico;

import br.com.estudos.GOrientacaoAObjetos.polimorfismo.dominio.Produto;
import br.com.estudos.GOrientacaoAObjetos.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relat�rio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Pre�o: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();

            System.out.println(dataValidade);
        }
        
        
        
    }
}