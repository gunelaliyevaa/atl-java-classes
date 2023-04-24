package az.atlacademy.module01.lesson09;

import java.util.Scanner;

public class OneDigitNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n < 10 && n > -10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
