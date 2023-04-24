package az.atlacademy.module01.lesson03_p2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = 0;
        for ( ; num > 0; ) {
            res += num % 10;
            num = num / 10;
        }
        System.out.println(res);
    }
}

