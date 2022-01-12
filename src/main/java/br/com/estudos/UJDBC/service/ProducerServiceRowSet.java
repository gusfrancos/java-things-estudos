package br.com.estudos.UJDBC.service;

import java.util.List;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.repository.ProducerRepositoryRowSet;

public class ProducerServiceRowSet {
	public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }
}
