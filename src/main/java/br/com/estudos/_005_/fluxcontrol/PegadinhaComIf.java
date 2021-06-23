package br.com.estudos._005_.fluxcontrol;

public class PegadinhaComIf {

	public static void main(String[] args) {
		boolean c = false;
		
		if(c = true) {
			System.out.println("Entrou");
		}
		
		
		
var hasParams = (args == null ? false : true);

System.out.println(args);

System.out.println(hasParams);
		
		//if pode ser composto com dua chaves sem o else
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }

		

	}

}
