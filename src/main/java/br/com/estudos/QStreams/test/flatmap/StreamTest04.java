package br.com.estudos.QStreams.test.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("�dipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}

/**
 * Ambas pegam os elementos de um stream de dados (geralmente uma solu��o como array ou ArrayList) e cada elemento ter� uma a��o a ser definida em seguida.
 * A diferen�a que flatMap() consegue fazer isso em streams que possuem dimens�es (ele achata os dados para ficar linear), ent�o cada elementos daquela cole��o de dados ser� usado independente de ele estar aninhado nessa cole��o. Quando voc� tem dados que est�o de forma linear nunca � preciso us�-la.
 * Vamos dizer que voc� tenha uma lista de listas, a fun��o map() pegaria as listas internas, mas o que voc� quer � os elementos dessas listas, ent�o s� flatMap() resolve.
 * Outro exemplo � ter uma lista de strings e voc� quer os caracteres. Enquanto map() pegara os textos um por um, flatMap() pegaria os caracteres.
*/