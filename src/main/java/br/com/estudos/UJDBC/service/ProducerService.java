package br.com.estudos.UJDBC.service;

import java.util.List;

import br.com.estudos.UJDBC.dominio.Producer;
import br.com.estudos.UJDBC.repository.ProducerRepository;

public class ProducerService {
	 public static void save(Producer producer) {
	        ProducerRepository.save(producer);
	    }

	    public static void delete(int id) {
	        if (id <= 0) {
	            throw new IllegalArgumentException("Invalid value for id");
	        }
	        ProducerRepository.delete(id);
	    }
	    
	    public static void update(Producer producer) {
	        requireValidId(producer.getId());
	        ProducerRepository.update(producer);
	    }

	    private static void requireValidId(Integer id) {
	        if (id == null || id <= 0) {
	            throw new IllegalArgumentException("Invalid value for id");
	        }
	    }
	    
	    public static List<Producer> findByName(String name) {
	        return ProducerRepository.findByName(name);
	    }
	    
	    public static void showProducerMetadata() {
	        ProducerRepository.showProducerMetadata();
	    }
	    
	    public static void showDriverMetaData() {
	        ProducerRepository.showDriverMetaData();
	    }

	    
	    public static List<Producer> findAll() {
	        return ProducerRepository.findAll();
	    }

}
