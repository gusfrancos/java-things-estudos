package br.com.estudos.BTipos;

/**
 * Temos dois tipos de variaveiss as do tipo primitivo e a dos tipo reference (são os objetos)
 * Temos 8 tipos de variáveis primitivas (São tipos de dados que guardam em memória valores simples):
 * int, double, float, boolean, char, byte,short, long
 * 
 * Tipos integrais (São tipos de dados que representam um inteiro)
 * São eles: os byte, short, int, long e char
 *  
 *  
 * Pontos flutuantes 
 * São eles double e float
 * 
 * 
 * Convenção para nome de variáveis: 
 * Devem iniciar com minuscula. 
 * Palavras internas começam com letras maiusculas.
 * Não devem comear com underline ou $, mesmo que ambos sejam permitidos.
 * Use nomes curtos, mas significativos. 
 * O nome deve indicar a intenção da utilização da variável. 

 * 
 */
public class TiposPrimitivos 
{
    public static void main( String[] args )
    {
    	// double, float, byte, boolean, char, short, long, int
    	
    	//************* Pontos flutuantes*******************************
    	//double - 64bits - 8bytes - Ponto flutuante
    	double salarioDouble = 30000;
    	double salarioDouble2 = 30000.0;
    	double salarioDouble3 = 30000.0d;
    	
       	//float - 32bits - 4bytes - Ponto flutuante
    	float floatRecebeInteger = 3000;
    	float floatRecebeNegativo = -1;
    	float floatRecebeHex = 0x0123;
    	float floatRecebe = 4f;
    	float floatRecebeDouble = 123.04f;
    	//nos casos abaixo o cast implicito não é permitido, pois o valor pode ser um double
    	//float g = 0 * 1.5;
    	//float h = 1.5 + 1.5;
    	//***********************************************
    	
    	
    	//************* Integral *******************************
    	//byte - 8bits - Integral
    	//-128 até 127
    	byte idadeByte = 12;
    	
    	//short - 16bits - Integral
    	//-32768 atÃ© 32767
    	short idadeShort = 32727;
    	//Short precisa de cast para byte e byte precisa de cast para short por causa de seus ranges
    	    	
    	//int - 32bits - Integral
    	//-2.147.483.648 até 2.147.483.647
    	int idadeDosPaisParaCadastro = 10;
    	
    	//long - 64bits - Integral
    	long numeroGrande = 1000L;
    	//***********************************************
    	
    
    	//***********************************************    	
    	// boolean - true or false
    	boolean verdadeiro = true;
    	boolean falso = false;
    	//***********************************************
    
    	//*********************************************** 
    	// Char recebe 2 bytes
    	// 0 e 65535
    	char caractere1 = 'A'; //valor literal 
    	char caractere2 = 95;  // valor nÃºmerico 95 Ã© igual a _
    	char carctere3 = '\u0041'; // valor hexadecimal Ã© igual a letra A
    	//*********************************************** 
    	
    	
    	//variaveis de classe recebem valor de inicializaÃ§Ã£o padrÃ£o
    			// as de tipo reference recebe valor null e as de primitivo dentro da classe 
    			// recebe valores padroes
    			// (int, double, float, long recebe 0)
    			// (Boolean recebe valor padrÃ£o false)
    			// (char recebe um espaÃ§o em branco)
       
    }
}
