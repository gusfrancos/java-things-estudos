package br.com.estudos.NLambdas.Predicate.test;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamIterate {

    public static void main(String[] args) {

        Predicate<Double> pred = e -> e < 100;
        UnaryOperator<Double> op = e -> e * 2;

        Stream.iterate(1d, pred, op).forEach(System.out::println);
    }
}
