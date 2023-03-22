package az.atlacademy.lesson10.mixedhomework4;

import java.util.Scanner;

public class Rectangle2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}