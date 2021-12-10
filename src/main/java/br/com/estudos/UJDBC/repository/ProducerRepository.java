package br.com.estudos.UJDBC.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.estudos.UJDBC.conn.ConnectionFactory;
import br.com.estudos.UJDBC.dominio.Producer;

public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
