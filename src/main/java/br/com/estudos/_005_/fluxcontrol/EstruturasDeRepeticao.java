package br.com.estudos._005_.fluxcontrol;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		// while, do while, for
		
		int count = 0;
		while(count < 10) {
			System.out.println(count);
			count++;
		}
		
		//do while roda pelo menos uma vez
		do {
			System.out.println("while");
		}
		while (count < 10);
		
		
		for(int i = 0; i< 10; i++) {
			System.out.println("For" + i);
		}

	}

}
