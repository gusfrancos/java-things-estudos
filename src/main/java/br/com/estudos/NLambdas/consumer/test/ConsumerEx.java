package br.com.estudos.NLambdas.consumer.test;

import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {

        Consumer<String> showThreeTimes = value -> {

            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
        };

        showThreeTimes.accept("blue sky");
        showThreeTimes.accept("old falcon");
    }
}
