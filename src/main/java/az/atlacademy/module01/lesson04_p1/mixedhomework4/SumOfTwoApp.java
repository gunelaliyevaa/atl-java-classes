package az.atlacademy.module01.lesson04_p1.mixedhomework4;

import java.util.Scanner;

public class SumOfTwoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a + b);
        }
    }
}
