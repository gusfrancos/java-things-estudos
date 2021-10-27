package br.com.estudos.NLambdas.Predicate.test;

import java.util.List;
import java.util.function.Predicate;

public class StreamAllMatch {

    public static void main(String[] args) {

        var values1 = List.of(1, 5, 3, 2, 8, 6, 7);
        var values2 = List.of(1, 5, 3, -2, 8, 0, 9);

        Predicate<Integer> isPositive = e -> e > 0;

        var res1 = values1.stream().allMatch(isPositive);

        if (res1) {
            System.out.println("All values of collection values1 are positive");
        } else {
            System.out.println("All values of collection values1 are not positive");
        }

        var res2 = values2.stream().allMatch(isPositive);

        if (res2) {
            System.out.println("All values of collection values2 are positive");
        } else {
            System.out.println("All values of collection values2 are not positive");
        }
    }
}
