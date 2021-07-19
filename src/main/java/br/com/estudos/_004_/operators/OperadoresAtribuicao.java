package br.com.estudos._004_.operators;
public class OperadoresAtribuicao {

	/**
	 *  =  
	 *  -=
	 *  +=
	 *  *=
	 *  /=
	 *  %=
	 *  ++
	 *  --
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int contador = 0;
		
		//Existe diferença de colocar atribuição (++ e --) atras e na frente da variavel
		//o valor vai imprimir 0 pois a soma só vai ser feita depois que passar pela execução
		System.out.println(contador++);
		
		//o valor vai imprimir 2 pois a soma só vai ser feita antes que passar pela execução
		System.out.println(++contador);

	}

}
