package az.atlacademy.lesson10.mixedhomework4;

import java.util.Scanner;

public class SimpleProblemApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.printf("%d %d", (n / 10), (n % 10));
    }
}
