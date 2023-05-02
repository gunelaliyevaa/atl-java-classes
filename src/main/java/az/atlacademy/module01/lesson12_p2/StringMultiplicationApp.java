package az.atlacademy.module01.lesson12_p2;

import java.util.Scanner;

public class StringMultiplicationApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (true) {
            String strNumber = scan.next();
            try {
                num = Integer.parseInt(strNumber);
                System.out.println(num * 5);
                break;
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
