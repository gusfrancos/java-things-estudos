package br.com.estudos.HExcecoes.runtime.test;

public class RuntimeExceptionTest01 {
	public static void main(String[] args) {
        // Checked e Unchecked
		//checked: s�o exece��es que s�o filhas da classe Exception diretamente (se n�o tratadas elas lnacam erro em tempo de compila��o)
		//Unchecked: � a exce��o RuntimeException e suas filhas diretas
		
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
