package az.atlacademy.module02.lesson06;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbcApp {

    public static final String getAllReadersSql = "SELECT * FROM reader;";

    public static void main(String[] args) {
        for (Reader readers : getAllReaders()) {
            System.out.println(readers.toString());
        }
    }

    public static List<Reader> getAllReaders() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(getAllReadersSql);
            ResultSet resultSet = query.executeQuery();
            List<Reader> readers = new ArrayList<>();
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                BigDecimal phoneNumber = resultSet.getBigDecimal("phone_number");
                readers.add(new Reader(firstName, lastName, phoneNumber));
            }
            return readers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
