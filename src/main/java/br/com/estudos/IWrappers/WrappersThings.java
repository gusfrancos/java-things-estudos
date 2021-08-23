package br.com.estudos.IWrappers;

public class WrappersThings {

	public static void main(String[] args) {
		//Wrappers - Tipos de referencia
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
		
		
		
		String nome = "Gustavo";
    	
    	Integer i1 = 1;
    	

    	//um double ou um float dividido por zero causa INFINITY
    	Double d = 10.0 / 0.0;
    	d.isInfinite(d);  //true
    	
    	
    	//variaveis de classe recebem valor de inicialização padrão
    			// as de tipo reference recebe valor null e as de primitivo dentro da classe 
    			// recebe valores padroes
    			// (int, double, float, long recebe 0)
    			// (Boolean recebe valor padrão false)
    			// (char recebe um espaço em branco)
		

	}

}
