package az.atlacademy.module01.lesson03_p1;

import java.util.Scanner;

public class ConditionsApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();

        switch (var) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Not defined");
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
