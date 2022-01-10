package br.com.estudos.UJDBC.test;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.service.ProducerService;

public class ConnectionFactoryTest07 {
	 public static void main(String[] args) {
	        Producer producer = Producer.builder().name("Studio Deen").build();
	        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
	        ProducerService.findByNameAndDelete("A-1 pictures");
	    }

}
