package br.com.estudos.GOrientacaoAObjetos.inheritance;

public class HerancaTest02 {
    // 0 - Bloco de inicializa��o est�tico da super classe � executado quando a JVM carregar classe pai
    // 1 - Bloco de inicializa��o est�tico da subclasse � executado quando a JVM carregar classe filha
    // 2 - Alocado espaco em mem�ria pro objeto da superclasse
    // 3 - Cada atributo de superclasse � criado e inicializado com valores default ou o quer for passado
    // 4 - Bloco de inicializa��o da superclasse � executado na ordem em que aparece
    // 5 - Construtor � executado da superclasse
    // 6 - Alocado espaco em mem�ria pro objeto da subclasse
    // 7 - Cada atributo de subclasse � criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicializa��o da subclasse � executado na ordem em que aparece
    // 9 - Construtor � executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
