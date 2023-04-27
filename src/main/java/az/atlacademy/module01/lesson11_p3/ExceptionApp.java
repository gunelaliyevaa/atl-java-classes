package az.atlacademy.module01.lesson11_p3;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        int num = 0;

        try {
            num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Exception thrown!");
        }

        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}
