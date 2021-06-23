package br.com.estudos._007_.oo;

//Etapas da inacialização de um objeto
	// 1 - Bloco de inicialização estatico é executado antes de qualquer coisa e só roda uma vez.
	// 2 - Aloca espaço na memória para o objeto que será criado
	// 3 - Cada atributo de classe é inicializado com seus valores default ou valores explicitos
	// 4  - Bloco de inicialização padrão é executado
	// 5 - o construtor é executado
	

public class InitTest{
	
	static String s1 = sM1("a"); 
	
	static{
	      s1 = sM1("b");
	   }
	
	static String s2 = sM1("c");
	
	String s3 = sM1("2");
	
	{
	      s1 = sM1("3");
	   }
	  
	  String s4 = sM1("4");
	
	public InitTest(){
	      s1 = sM1("1");
	   }
	   
	   
	  
	   
	 
	    public static void main(String args[]){
	        InitTest it = new InitTest();
	    }
	    private static String sM1(String s){
	       System.out.println(s);  return s;
	    }
	}
