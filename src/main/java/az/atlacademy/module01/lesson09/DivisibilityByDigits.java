package az.atlacademy.module01.lesson09;

import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int d1 = n / 1000;
        int d2 = n / 100 % 10;
        int d3 = n / 10 % 10;
        int d4 = n % 10;

        if (d1 != 0 && d2 != 0 && d3 != 0 && d4 != 0
                && n % d1 == 0 && n % d2 == 0
                && n % d3 == 0 && n % d4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
