package br.com.estudos.NLambdas.Predicate.test;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author https://zetcode.com/java/predicate/
 */
class BiggerThanFive<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {

        Integer five = 5;

        return v > five;
    }
}

public class JavaPredicateEx {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);

        BiggerThanFive<Integer> btf = new BiggerThanFive<>();
        nums.stream().filter(btf).forEach(System.out::println);
    }
}
