package az.atlacademy.module01.lesson03_p3;

import java.util.Scanner;

public class DigitOperationsApp {
    public static void main(String[] args) {
        // 1. input
        int num = new Scanner(System.in).nextInt();

        // 2. process
        int sum = 0;
        int prod = 1;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count++;
            sum += rem;
            prod *= rem;
        }

        // 3. output
        System.out.printf("Sum of Digits is: %d\n", sum);
        System.out.printf("Prod of Digits is: %d\n", prod);
        System.out.printf("Count of Digits is: %d\n", count);
    }
}
