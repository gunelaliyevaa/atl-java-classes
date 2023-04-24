package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class ConditionalStat3App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y;

        if (x < -4) {
            y = x + 5;
        } else if (x > 7) {
            y = (x * x * x) + (2 * x);
        } else {
            y = (x * x) - (3 * x);
        }

        System.out.println(y);
    }
}
