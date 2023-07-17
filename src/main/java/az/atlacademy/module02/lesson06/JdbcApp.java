package az.atlacademy.module02.lesson06;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbcApp {

    public static final String getAllReadersSql = "SELECT * FROM reader;";
    public static final String UpdateReadersSql = "UPDATE reader SET phone_number = ? WHERE phone_number>7";

    public static void main(String[] args) {
        getAllReaders().forEach(System.out::println);
        UpdatePhoneNumber(BigDecimal.valueOf(5556667));
    }

    public static void UpdatePhoneNumber(BigDecimal phoneNumber) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(UpdateReadersSql);
            query.setBigDecimal(1, phoneNumber);
            int affectedRows = query.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
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
