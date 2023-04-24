package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class MinimumAndMaximumApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 < num2) {
            System.out.printf("%d %d", num1, num2);
        } else {
            System.out.printf("%d %d", num2, num1);
        }
    }
}
