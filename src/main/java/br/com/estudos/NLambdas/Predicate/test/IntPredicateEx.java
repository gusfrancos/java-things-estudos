package br.com.estudos.NLambdas.Predicate.test;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class IntPredicateEx {

    public static void main(String[] args) {
        
        int[] nums = { 2, 3, 1, 5, 6, 7, 8, 9, 12 };
        
        IntPredicate p = n -> n > 5;

        Arrays.stream(nums).filter(p).forEach(System.out::println);
    }
}
