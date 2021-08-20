package br.com.estudos.HExcecoes.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args)  {
        divisao(1, 0);

        System.out.println("C�digo finalizado");
    }

    /**
     *
     * @param a
     * @param b n�o pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, n�o pode ser 0");
        }
        return a/b;
    }
}
