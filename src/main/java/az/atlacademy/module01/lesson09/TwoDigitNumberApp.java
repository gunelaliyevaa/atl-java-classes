package az.atlacademy.module01.lesson09;

import java.util.Scanner;

public class TwoDigitNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if ((n < 100 && n > 9) || (n > -100 && n < -9)) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
