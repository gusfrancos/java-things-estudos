package br.com.estudos.UJDBC.test;

import java.util.List;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryRowSetTest01 {
	public static void main(String[] args) {
        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("NHK");
        log.info(producers);
    }
}
