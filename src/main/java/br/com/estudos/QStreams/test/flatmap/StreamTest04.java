package br.com.estudos.QStreams.test.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
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
 * Ambas pegam os elementos de um stream de dados (geralmente uma solução como array ou ArrayList) e cada elemento terá uma ação a ser definida em seguida.
 * A diferença que flatMap() consegue fazer isso em streams que possuem dimensões (ele achata os dados para ficar linear), então cada elementos daquela coleção de dados será usado independente de ele estar aninhado nessa coleção. Quando você tem dados que estão de forma linear nunca é preciso usá-la.
 * Vamos dizer que você tenha uma lista de listas, a função map() pegaria as listas internas, mas o que você quer é os elementos dessas listas, então só flatMap() resolve.
 * Outro exemplo é ter uma lista de strings e você quer os caracteres. Enquanto map() pegara os textos um por um, flatMap() pegaria os caracteres.
*/