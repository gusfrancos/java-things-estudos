package br.com.estudos.OComportamento.interfaces;

import br.com.estudos.OComportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, fun��es, conciso
    boolean test(Car car);
    //(parametro) -> <express�o>
    //(Car car) -> car.getColor().equals("green");
}
