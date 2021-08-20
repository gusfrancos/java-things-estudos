package br.com.estudos.EEstruturasDeRepeticao;

import java.util.Iterator;

public class EstruturasDeRepeticaoBreak {

	public static void main(String[] args) {
		
		//brak só pode ser usado dentro de um switch ou uma estrutura de repetição
		
		int valorMax = 50;
		for(int i = 0; i <= valorMax; i++) {
			if (i > 25) {
				break;
			}
			// se não tiver break continua executando tudo abaixo do if até o valormax = 50
		}

	}

}
