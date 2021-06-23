package br.com.estudos._007_.oo.polimorfismo;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract void calcularPagamento();
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", getNome()=" + getNome() + ", getSalario()="
				+ getSalario() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
