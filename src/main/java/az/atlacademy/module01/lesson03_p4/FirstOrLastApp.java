package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class FirstOrLastApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int d1 = n / 100;
        int d3 = n % 10;
        if (d1 == d3) {
            System.out.println("=");
        } else if (d1 > d3) {
            System.out.println(d1);
        } else {
            System.out.println(d3);
        }

    }
}
