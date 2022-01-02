package br.com.estudos.UJDBC.repository;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.estudos.UJDBC.conn.ConnectionFactory;
import br.com.estudos.UJDBC.dominio.Producer;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer in the database, rows affected '{}'", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}