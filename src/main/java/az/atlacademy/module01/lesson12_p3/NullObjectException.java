package az.atlacademy.module01.lesson12_p3;


import java.util.Scanner;

public class NullObjectException {
    public static void main(String[] args) {
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
