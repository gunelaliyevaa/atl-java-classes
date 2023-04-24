package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class NoneOfTwoConditionsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if ((n % 2 == 0 && n < 0) || ((n % 2 != 0) && (n > 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

