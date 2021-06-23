package br.com.estudos._007_.oo.assertivas;

public class AssertivasThings {
	public static void main(String[] args) {
		
	}
	
	//é uma pessima pratica utilizar assert para métodos públicos
	private static void calculaSalario(double salario) {
		
		//igual ao if de baixo só que lança um erro se salario for menor igual a zero 
		assert(salario > 0);
		// assert serve só para testes e é ignorado a não ser se vc configurar na sua ide
		
		
		// pode passar uma msg
		assert(salario > 2): "Teste passar msg";
		
		// pode chamar um método
		assert(salario > 2): metodo();
		
		
		
		
		
//		if(salario > 0) {
//			//calculo salário
//		} else {
//			//ferrou
//		}
	}

	private static String metodo() {
		// TODO Auto-generated method stub
		return null;
	}

}
