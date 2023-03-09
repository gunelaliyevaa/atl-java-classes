package az.atlacademy.lesson06;

import java.util.Scanner;

public class ConditionsApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();

        if (var == 1) {
            System.out.println("January");
        } else if (var == 2) {
            System.out.println("February");
        } else if (var == 3) {
            System.out.println("March");
        } else if (var == 4) {
            System.out.println("April");
        } else if (var == 5) {
            System.out.println("May");
        } else if (var == 6) {
            System.out.println("June");
        } else if (var == 7) {
            System.out.println("July");
        } else if (var == 8) {
            System.out.println("August");
        } else if (var == 9) {
            System.out.println("September");
        } else if (var == 10) {
            System.out.println("October");
        } else if (var == 11) {
            System.out.println("November");
        } else if (var == 12) {
            System.out.println("December");
        } else {
            System.out.println("Not defined");
        }

        if (var > 12 || var <= 0) {
            System.out.println("Invalid Input");
        } else if (var >= 3 && var <= 5) {
            System.out.println("Spring");
        } else if (var >= 6 && var <= 8) {
            System.out.println("Summer");
        } else if (var >= 9 && var <= 11) {
            System.out.println("Fall");
        } else System.out.println("Winter");
    }
}
