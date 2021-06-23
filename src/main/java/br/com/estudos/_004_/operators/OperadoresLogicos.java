package br.com.estudos._004_.operators;

/**
 *  &&  = and
 *  || = or
 *  & = and
 *  | = or
 *  
 *  Se vc usar o &&  e a primeira condição já for falsa ele não verifica a segunda
 *  Se vc usar o &  ele sempre vai verificar todas as condições mesmo com a primeira sendo false
  *  Se vc usar  || e a primeira condição já for TRUE ele não ferifica a segunda
 *  Se vc usar  | ele sempre vai verificar todas as condições mesmo com a primeira sendo TRUE
  
 */
public class OperadoresLogicos {
	public int $ = 0;
	public int _price = 0; 
	
	public static void main(String[] args) {
		
		
		int d = 1 % 3;
		System.out.println("mod: " + d);
		
		
		
		//operador or pode ser usado como +
		char b = 'a' | 'b';
		int c =  15 | 30;
		System.out.println(c);
		
		
		int y = 5 & 3;
		System.out.println(y);
		
	}
	

}
