package az.atlacademy.lesson09;

import java.util.Scanner;

public class DivisibilityApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a % b != 0) {
            System.out.printf("%d %d", (a / b), (a % b));
        } else {
            System.out.println("Divisible");
        }
    }
}
