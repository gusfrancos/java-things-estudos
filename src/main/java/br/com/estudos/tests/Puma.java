package br.com.estudos.tests;

/**
 * 
 * @author gusfr
 * o método  getTailLength da interface HashTail é assumido como public já que não é declarado
 * e a classe Puma devia implementar o método com visibilidade de publico 
 */
abstract class Puma implements HashTail {
	protected int getTailLength() {return 4;}
	
}
