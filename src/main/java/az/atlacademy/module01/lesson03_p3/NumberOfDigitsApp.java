package az.atlacademy.module01.lesson03_p3;

import java.util.Scanner;

public class NumberOfDigitsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}