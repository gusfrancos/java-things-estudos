package br.com.estudos.UJDBC.test;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(producer);
    }
}
