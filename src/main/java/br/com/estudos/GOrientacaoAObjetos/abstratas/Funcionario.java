package br.com.estudos.GOrientacaoAObjetos.abstratas;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    @Override
    public void imprime() {
    	System.out.println("Imprimindo...");
    }
    
    
    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
