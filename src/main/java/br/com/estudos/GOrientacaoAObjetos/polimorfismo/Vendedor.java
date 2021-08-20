package br.com.estudos.GOrientacaoAObjetos.polimorfismo;

public class Vendedor extends Funcionario {
	private double totalVendas;
	
	public Vendedor(String nome, double salario, double totalVendas) {
		super();
		this.totalVendas = totalVendas;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public void calcularPagamento() {
		this.salario = this.salario + (totalVendas * 0.05);
		
	}
}
