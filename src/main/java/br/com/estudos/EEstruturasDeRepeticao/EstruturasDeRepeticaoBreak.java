package br.com.estudos.EEstruturasDeRepeticao;

import java.util.Iterator;

public class EstruturasDeRepeticaoBreak {

	public static void main(String[] args) {
		
		//brak s� pode ser usado dentro de um switch ou uma estrutura de repeti��o
		
		int valorMax = 50;
		for(int i = 0; i <= valorMax; i++) {
			if (i > 25) {
				break;
			}
			// se n�o tiver break continua executando tudo abaixo do if at� o valormax = 50
		}

	}

}
