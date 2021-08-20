package br.com.estudos.COperadores;

/**
 * Class OperatorsThings
 * 
 *Links:
 *
 *Things:
 * (b1 = i1 == i2) quando observar um caso parecido ver que o == tem precedência maior do que o =
 */
public class OperatorsThings {
	public static void main(String[] args) {
		
		boolean b1 = false;
		int i1 = 2;
		int i2 = 3;
		//(b1 = i1 == i2) quando observar um caso parecido ver que o == tem precedência maior do que o =
		//Então b1 = false
		if (b1 = i1 == i2){
		   System.out.println("true");
		} else{
		   System.out.println("false");
		}
		
		System.out.println("**********************************************************");
		
		String str = "10";
        int iVal = 0;
        Double dVal = 0.0;
        try{
            iVal = Integer.parseInt(str, 2);  
            if((dVal = Double.parseDouble(str)) == iVal){ //neste caso a atribuição ocorreu antes do teste de igualdade, devido os tipos serem iguais
                System.out.println("Equal");
            }
        }catch(NumberFormatException e){
            System.out.println("Exception in parsing");
        }
        System.out.println(iVal+" "+dVal);
        
    }
		
		
}
	
	
	// *  Se vc usar o && ou  || e a primeira condição já for falsa ele não ferifica a segunda
	// *  Se vc usar o & ou o | ele sempre vai verificar todas as condições mesmo com a primeira sendo false
	// *  Se vc usar o && ou  || e a primeira condição já for falsa ele não ferifica a segunda
	// *  Se vc usar o & ou o | ele sempre vai verificar todas as condições mesmo com a primeira sendo false



