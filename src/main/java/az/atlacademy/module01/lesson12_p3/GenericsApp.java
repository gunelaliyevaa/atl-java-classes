package az.atlacademy.module01.lesson12_p3;

import java.util.Scanner;

public class GenericsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = "NEMO";
        Integer integer = 5;
        Person person = new Person("Theodore");
    }

    public static <T> T getOrElseThrow(T data) {
        if (data == null) {
            throw new NullPointerException("Invalid Input!");
        }
        return data;
    }
}

