package br.com.estudos.GOrientacaoAObjetos.abstratas;

public class Estudante {
	public String nome;
	public String matricula;
	public int idade;
	public char sexo;
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.sexo);
	}
}
