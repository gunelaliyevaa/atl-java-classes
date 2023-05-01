package az.atlacademy.module01.lesson12_p2;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateTimeApp {
    public static void main(String[] args) throws InvalidBirthDateException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth date. yyyy/MM/dd");
        LocalDate birthday = null;
        try {
            birthday = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
            if (birthday.isAfter(LocalDate.now())) {
                throw new InvalidBirthDateException("Invalid Birth Date!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(birthday);
    }
}
