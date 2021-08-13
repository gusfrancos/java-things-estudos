package br.com.estudos._007_.oo.polimorfismo.servico;

import br.com.estudos._007_.oo.polimorfismo.dominio.Produto;
import br.com.estudos._007_.oo.polimorfismo.dominio.Tomate;

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