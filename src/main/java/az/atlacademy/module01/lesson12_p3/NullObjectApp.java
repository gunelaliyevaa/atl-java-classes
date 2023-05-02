package az.atlacademy.module01.lesson12_p3;


import java.util.Scanner;

public class NullObjectApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = "NEMO";
        Integer integer = 5;
        Person person = new Person("Theodore");
    }

    public static void validate(String string) {
        if (string == null) {
            throw new InvalidObjectException("Invalid Input!");
        }
    }

    public static void validate(Person person) {
        if (person == null) {
            throw new InvalidObjectException("Invalid Input!");
        }
    }

    public static void validate(Integer integer) {
        if (integer == null) {
            throw new InvalidObjectException("Invalid Input!");
        }
    }
}
