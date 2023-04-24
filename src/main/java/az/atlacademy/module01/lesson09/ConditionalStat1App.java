package az.atlacademy.module01.lesson09;

import java.util.Scanner;

public class ConditionalStat1App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y;

        if (x < 5) {
            y = x * x - 3 * x + 4;
        } else {
            y = x + 7;
        }

        System.out.println(y);
    }
}
