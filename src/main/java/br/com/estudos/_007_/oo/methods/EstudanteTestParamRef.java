package br.com.estudos._007_.oo.methods;

import br.com.estudos._007_.oo.abstratas.Estudante;

public class EstudanteTestParamRef {

	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';
        
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
  
	}

}
