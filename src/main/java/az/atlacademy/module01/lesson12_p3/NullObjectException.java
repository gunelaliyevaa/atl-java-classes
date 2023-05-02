package az.atlacademy.module01.lesson12_p3;


import java.util.Scanner;

public class NullObjectException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.toString();
        Integer integer = 5;
        Person person = new Person("Theodore");

        checkString(string);
        checkPerson(person);
        checkInteger(integer);
    }

    public static void checkString(String string) {
        if (string == null) {
            throw new InvalidObjectException("Invalid Input!");
        }
    }

    public static void checkPerson(Person person) {
        if (person == null) {
            throw new InvalidObjectException("Invalid Input!");
        }
    }

    public static void checkInteger(Integer integer) {
        if (integer == null) {
            throw new InvalidObjectException("Invalid Input!");
        }
    }
}
