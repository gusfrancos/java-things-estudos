package br.com.estudos.HExcecoes.runtime.test;

public class RuntimeExceptionTest01 {
	public static void main(String[] args) {
        // Checked e Unchecked
		//checked: são execeções que são filhas da classe Exception diretamente (se não tratadas elas lnacam erro em tempo de compilação)
		//Unchecked: é a exceção RuntimeException e suas filhas diretas
		
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
