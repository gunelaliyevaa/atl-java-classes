package az.atlacademy.lesson08;

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
