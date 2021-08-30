package br.com.estudos.ICUtilitarias.BStrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); //retorna um char baseado no indice
        System.out.println(nome.length()); //tamanho das strings
        System.out.println(nome.replace("f","l")); //faz a troca de strings 
        System.out.println(nome.toLowerCase()); // caixa baixa
        System.out.println(nome.toUpperCase()); // caixa alta
        System.out.println(numeros.length()); //tamanho da string
        System.out.println(numeros.substring(3,numeros.length())); //retorna uma string pela posi��o inicial e final do indice
        //parametro 1:  indice come�a do zero
        //parametro 2: indice come�a do 1
        System.out.println(nome.trim()); //remove os valores em branco do come�o e do fim da string
        
    }
}
