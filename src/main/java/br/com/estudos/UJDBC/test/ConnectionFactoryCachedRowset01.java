package br.com.estudos.UJDBC.test;
// CachedRowset -  conecta / pega os dados disconecta e assim vc fica com os dados disconectados para trabalhar

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.service.ProducerServiceRowSet;

public class ConnectionFactoryCachedRowset01 {
	public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MAD2").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("------------------------");
//        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }

}
