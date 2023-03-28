package az.atlacademy.lesson13;

import java.util.Scanner;

public class DigitsMethodApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        digits(num);
    }

    public static void digits(int num) {
        while (num > 0) {
            System.out.print(num % 10 + " ");
            num = num / 10;
        }
    }
}