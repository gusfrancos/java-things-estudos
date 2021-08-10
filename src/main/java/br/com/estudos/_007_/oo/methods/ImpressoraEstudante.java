package br.com.estudos._007_.oo.methods;

import br.com.estudos._007_.oo.abstratas.Estudante;

public class ImpressoraEstudante {

	public void imprime(Estudante estudante){
        System.out.println("-----------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }

}
