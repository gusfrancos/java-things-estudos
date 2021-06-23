package br.com.estudos._004_.operators;


/**
 *  ++  =  Increment
 *  --  = Decrement
 *  +   = Plus
 *  -   = Minus
 *  ()  = Cast
 *  !   = NOT
 *  /   = divisão
 *  *   = Multiplicação
 *  %   = resto da divisão
 */

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		
		// Vai ser 33 operador mais tem left precedencia
		// portanto vai somar primeiro (1 + 2) e depois concatenar
		System.out.println(1 + 2 + "3");
		
		// var ser 123 o operador mais tem left precedencia
		// neste caso vai contatenar primeiro ("1" + 2)  e depois concatenar o ultimo
		System.out.println("1" + 2 + 3);
		
		//Vai fazer cast do integer em um float e depois somar
		//5.0f
		System.out.println(4 + 1.0f);
		
		// 5 e 4 são inteiros ele vai pegar o resultado transformar 
		// para inteiro arredondando
		System.out.println(5/4);
		
		// cast sempre do menor para o maior
		// vai transformar char 'a' em int e somar
		System.out.println('a' + 1);
		
		
		
	}

}
