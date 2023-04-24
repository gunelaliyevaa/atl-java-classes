package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class NumOfSameSignApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        if ((n > 0 && m > 0) || (n < 0 && m < 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
