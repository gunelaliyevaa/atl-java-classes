package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class InsideTheIntervalApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (x >= a && x <= b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
