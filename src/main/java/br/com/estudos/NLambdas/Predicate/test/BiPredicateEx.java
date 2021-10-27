package br.com.estudos.NLambdas.Predicate.test;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {

        var words = List.of("sky", "water", "club", "spy", "silk", "summer",
                "war", "cup", "cloud", "coin", "small", "terse", "falcon", 
                "snow", "snail", "see");

        BiPredicate<String, Integer> pred = (w, len) -> w.length() == len;
        words.stream().filter(e -> pred.test(e, 3)).forEach(System.out::println);

        System.out.println("---------------------");

        words.stream().filter(e -> pred.test(e, 4)).forEach(System.out::println);
    }
}
