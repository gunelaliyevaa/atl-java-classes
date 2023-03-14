package az.atlacademy.lesson10;

import java.util.Scanner;

public class FormatDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        System.out.printf("%.2f", n);
    }
}
