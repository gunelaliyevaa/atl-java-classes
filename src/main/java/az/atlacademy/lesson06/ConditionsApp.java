package az.atlacademy.lesson06;

import java.util.Scanner;

public class ConditionsApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();

        if ( var > 0) {
            System.out.println("positive!");
        } else {
            System.out.println("negative!");
        }
    }
}
