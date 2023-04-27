package az.atlacademy.module01.lesson11_p3;

import java.util.Scanner;

public class ExceptionApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        String number2 = scan.next();
        int num = 0;
        int num2 = 0;

        try {
            num = Integer.parseInt(number);
            num2 = Integer.parseInt(number2);
        } catch (NumberFormatException e) {
            System.out.println("Exception thrown!");
            e.printStackTrace();
        }

        System.out.println(num / num2);
    }
}
