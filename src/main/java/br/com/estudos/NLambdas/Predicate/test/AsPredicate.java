package br.com.estudos.NLambdas.Predicate.test;

import java.util.List;
import java.util.regex.Pattern;

public class AsPredicate {

    public static void main(String[] args) {

        var words = List.of("skylark", "trial", "water", "cloud", "curtain", "falcon");

        var pred = Pattern.compile("^...{3}$").asPredicate();
        var res = words.stream().anyMatch(pred);

        if (res) {
            System.out.println("There is a word which has three latin characters");
        } else {
            System.out.println("There is no word which has three latin characters");
        }
    }
}
