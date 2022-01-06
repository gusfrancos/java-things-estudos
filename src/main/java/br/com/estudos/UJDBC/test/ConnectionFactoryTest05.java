package br.com.estudos.UJDBC.test;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.service.ProducerService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest05 {
	public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        ProducerService.showTypeScrollWorking();
    }
}
