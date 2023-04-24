package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class WaterAndIceApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        if (t > 0) {
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }
    }
}
