package az.atlacademy.lesson07;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int res = 1;
        for (; num > 0; ) {
            res *= num % 10;
            num = num / 10;
        }
        System.out.println(res);
    }
}

