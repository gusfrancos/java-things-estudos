package br.com.estudos.LGenerics.test;

import br.com.estudos.LGenerics.dominio.Carro;
import br.com.estudos.LGenerics.services.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um m�s...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
