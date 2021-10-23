package br.com.estudos.OComportamento.interfaces;

import br.com.estudos.OComportamento.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
}
