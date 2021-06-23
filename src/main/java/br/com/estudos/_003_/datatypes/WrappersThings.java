package br.com.estudos._003_.datatypes;

public class WrappersThings {

	public static void main(String[] args) {
		//tipos primitivos
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 1;
		long longPrimitivo = 1;
		float floatPrimitivo = 1.0f;
		double doublePrimitivo = 1.0;
		boolean booleanPrimitivo = true;
		char charPrimitivo = 'b';
		
		//Wrappers
		Byte byteWrappers = 1;    
		Short shortWrappers = 1;
		Integer intWrappers = 1;
		Long longWrappers = 1L;
		Float floatWrappers = 1.0f;
		Double doubleWrappers = 1.0;
		Boolean booleanWrappers = true;
		Character charWrappers = 'b';   //Construtor não recebe string
		String strWrappers = "b";
	
		//Autoboxing: pegar um tipo primitivo e jogar em um wrapper
		//Unboxing: passar um wrapper para um tipo primitivo
		
		
		Float f = Float.parseFloat("10"); /* igual a  */ Float f2 = new Float("10");
		
		//como recuperar um wrapper
		Long lw = Long.valueOf(10);
		
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetterOrDigit('#'));
		
		
		
		
		

	}

}
