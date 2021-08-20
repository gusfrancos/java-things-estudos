package br.com.estudos.BTipos;

public class VarThings {
	public void myMethod(String...params) {
		// para o var não é permitido declarar classes e métodos;
    	// o var sempre tem que ser inicializado para poder saber o tipo
    	//var (tipo de variavel em que o computador vai inferir o tipo apartir da inicialização
    	// não pode usar var para declarar parametros de metodos
    	var testesf = 1;
    	
    	// no var posso receber um objeto
    	var bobo = new String();
    	
    	
    	
    	//no var vc pode usar ja inicializando com uma operaÃ§Ã£o
    	int x = 0;
    	int y = 0;
    	var m = x > y ? x:y;
    	
    	//posso usar o var dentro do primeiro parametro do FOR
    	for( var i = 0; i < 3; System.out.println(i++)) {
    		
    	}
    	
    	
    	//no var nÃ£o Ã© permitido multipla declaraÃ§Ã£o de variaveis
    	//Ex nÃ£o permitido: var a = b = c = 100;
    	
    	//Permitido
    	var b = 0;
    	var c = 0;
    	var a = b = c = 100;
    	
    	
    	//Exemplos de multipla declaraÃ§Ã£o com int
    	int g, hb, j = 100;
    	
    	int p=100, t;
    	
    	int q, w, e; q = w = e = 100;
		
	}

}
