package br.com.estudos.GOrientacaoAObjetos.polimorfismo;

public class RelatorioPagamento {
	public void relatorioPagamentoGerente(Gerente gerente) {
		System.out.println("Relatório:");
		gerente.calcularPagamento();
		System.out.println("Nome" + gerente.getNome());
		System.out.println("Salário:" + gerente.getSalario());
	}
	
	public void relatorioPagamentoGerente(Vendedor vendedor) {
		System.out.println("Relatório:");
		vendedor.calcularPagamento();
		System.out.println("Nome" + vendedor.getNome());
		System.out.println("Salário:" + vendedor.getSalario());
	}

}
