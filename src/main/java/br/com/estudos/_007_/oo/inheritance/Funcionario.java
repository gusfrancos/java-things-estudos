package br.com.estudos._007_.oo.inheritance;

import br.com.estudos._007_.oo.Pessoa;

public class Funcionario extends Pessoa{

	private double salario;
	
	
	
	   public void imprimir() {
	    	System.out.println("Nome:" + this.getNome());
	    	System.out.println("Cpf:" + this.getCpf());
	    	System.out.println("Endereço:" + this.getEndereco());
	    	System.out.println("Salário:" + this.salario);
	    	
	    }
	

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	

}
