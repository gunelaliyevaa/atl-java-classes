package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class PreviousOddIntegerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println(n - 1);
        } else {
            System.out.println(n - 2);
        }
    }
}
