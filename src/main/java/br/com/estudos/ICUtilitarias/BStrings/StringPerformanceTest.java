package br.com.estudos.ICUtilitarias.BStrings;

public class StringPerformanceTest {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(30000);
		long fim = System.currentTimeMillis() - inicio;
		System.out.println("String: " + fim + " ms");
		
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(300000);
		fim = System.currentTimeMillis() - inicio;
		System.out.println("String Builder: " + fim + " ms");
		
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(300000);
		fim = System.currentTimeMillis() - inicio;
		System.out.println("String Buffer: " + fim + " ms");
		
		
	}
	
	
	private static void concatString(int tam) {
		String string = "";
		
		for (int i = 0; i < tam; i++) {
			
			string += i;
			
		}
	}
	
	private static void concatStringBuilder(int tam) {
		StringBuilder sb = new StringBuilder(tam);
		
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}
	
	private static void concatStringBuffer(int tam) {
		StringBuffer sb = new StringBuffer(tam);
		
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}

}
