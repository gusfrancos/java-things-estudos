package br.com.estudos.GOrientacaoAObjetos.BMetodos;

import br.com.estudos.GOrientacaoAObjetos.abstratas.Estudante;

public class ImpressoraEstudante {

	public void imprime(Estudante estudante){
        System.out.println("-----------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }

}
