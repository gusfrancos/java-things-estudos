package br.com.estudos._014_.designparttenrs.strategy;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);

    CalculadorDeImpostos calculador = new CalculadorDeImpostos();

    // Calculando o ISS
    calculador.realizaCalculo(orcamento, iss);

    // Calculando o ICMS        
    calculador.realizaCalculo(orcamento, icms);
    
    // Calculando o ICCC        
    calculador.realizaCalculo(orcamento, iccc);
    }
}
