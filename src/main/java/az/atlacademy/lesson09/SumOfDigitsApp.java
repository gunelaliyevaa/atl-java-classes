package az.atlacademy.lesson09;

import java.util.Scanner;

public class SumOfDigitsApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int d1 = n / 1000;
        int d4 = n % 10;

        System.out.println(d1 + d4);
    }
}
