package az.atlacademy.module02.lesson06;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbcApp {

    public static final String getAllReadersSql = "SELECT * FROM reader;";

    public static void main(String[] args) {
        for (Readers readers : getAllReaders()) {
            System.out.println(readers.toString());
        }
    }

    public static List<Readers> getAllReaders() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(getAllReadersSql);
            ResultSet resultSet = query.executeQuery();
            List<Readers> readers = new ArrayList<>();
            while (resultSet.next()) {
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                BigDecimal phone_number = resultSet.getBigDecimal("phone_number");
                readers.add(new Readers(first_name, last_name, phone_number));
            }
            return readers;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }
}
