package br.com.estudos.NLambdas.interfaces;

import br.com.estudos.NLambdas.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, fun��es, conciso
    boolean test(Car car);
    //(parametro) -> <express�o>
    //(Car car) -> car.getColor().equals("green");
}
