package az.atlacademy.lesson09;

import java.util.Scanner;

public class ProductOfDigitsApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int res = 1;
        for (; n > 0; ) {
            res *= n % 10;
            n = n / 10;
        }
        System.out.println(res);
    }
}
