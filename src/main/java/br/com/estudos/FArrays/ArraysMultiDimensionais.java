package br.com.estudos.FArrays;


public class ArraysMultiDimensionais {

	public static void main(String[] args) {
		
		//inicialização de arrays multidimencionais
		//int [][] numeros = new int [3] [];
		//numeros[0] = new int[2];
		//numeros[1] = new int[] {1,2,3};
		//numeros[2] = new int[4];
		
		int[][] numeros = {{1,2,3},{0,9,7,6,5},{1,2}};
		for (int[] refNum: numeros) {
			for(int num : refNum) {
				System.out.println(num);
			}
		}
		
		
		
		
		
		/********************************************/
		
		
		
		int [][] diasMes = new int [12] [31];
	
		for(int i = 1; i <=12; i++) {
			for (int j = 1; j <=31; j++) {
				diasMes [i-1][j-1] = j;
				
				//System.out.println(diasMes [i-1][j-1]);
				
			}
		}
		
		
		for(int[] mes : diasMes) {
			for(int dia : mes) {
				System.out.println(dia);
			}
		}
		

	}

}
