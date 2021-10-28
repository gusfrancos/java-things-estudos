package br.com.estudos.NLambdas.Predicate.test;

import java.util.List;
import java.util.function.Predicate;

import br.com.estudos.NLambdas.dominio.Country;

public class JavaMulCond {

    public static void main(String[] args) {

        var countries = List.of(
                new Country("Iran", 80840713),
                new Country("Hungary", 9845000),
                new Country("Poland", 38485000),
                new Country("India", 1342512000),
                new Country("Latvia", 1978000),
                new Country("Vietnam", 95261000),
                new Country("Sweden", 9967000),
                new Country("Iceland", 337600),
                new Country("Israel", 8622000));

        Predicate<Country> p1 = c -> c.getName().startsWith("I") &&
                                     c.getPop() > 10000000;

        countries.stream().filter(p1).forEach(System.out::println);
    }

   
}
