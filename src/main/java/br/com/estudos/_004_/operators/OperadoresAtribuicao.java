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
		
		//Existe diferen�a de colocar atribui��o (++ e --) atras e na frente da variavel
		//o valor vai imprimir 0 pois a soma s� vai ser feita depois que passar pela execu��o
		System.out.println(contador++);
		
		//o valor vai imprimir 2 pois a soma s� vai ser feita antes que passar pela execu��o
		System.out.println(++contador);

	}

}
