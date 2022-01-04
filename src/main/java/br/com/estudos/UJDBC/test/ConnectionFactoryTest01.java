package br.com.estudos.UJDBC.test;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.repository.ProducerRepository;
import br.com.estudos.UJDBC.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Sirulau").build();
        //ProducerRepository.save(producer);
        //ProducerService.delete(5);
       
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        ProducerService.update(producerToUpdate);
    }
}
