package br.com.estudos._007_.oo;

import br.com.estudos._007_.oo.inheritance.Endereco;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private int idade;
	private char sexo;
	
	
    public void imprimir() {
    	System.out.println("Nome:" + this.nome);
    	System.out.println("Cpf:" + this.cpf);
    	System.out.println("Endereço:" + this.endereco);
    	
    }
	
    
	
	
	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public char getSexo() {
		return sexo;
	}




	public void setSexo(char sexo) {
		this.sexo = sexo;
	}




	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	

}
