package br.com.estudos.GOrientacaoAObjetos.inheritance;

public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("Dentro do bloco de inicializa��o est�tico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco inicializa��o de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicializa��o de Funcionario 2");
    }
    public Funcionario(String nome) {
       super(nome);
        System.out.println("Dentro do construtor de funcion�rio");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recevi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
