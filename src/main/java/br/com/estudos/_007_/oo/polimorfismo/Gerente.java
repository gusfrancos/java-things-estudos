package br.com.estudos._007_.oo.polimorfismo;

public class Gerente extends Funcionario {
	private double pnl;
	
	public Gerente(String nome, double salario) { 
		
	}
		
	@Override
	public void calcularPagamento() {
		this.salario = this.salario + pnl;
		
	}

	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}

}
