package br.com.estudos.UJDBC.test;

import java.util.List;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.service.ProducerService;

public class ConnectionFactoryTransacao {
	public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("White fox").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
