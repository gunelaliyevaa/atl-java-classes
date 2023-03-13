package az.atlacademy.lesson09;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();

        if (var > 12 || var <= 0) {
            System.out.println("Invalid Input");
        } else if (var >= 3 && var <= 5) {
            System.out.println("Spring");
        } else if (var >= 6 && var <= 8) {
            System.out.println("Summer");
        } else if (var >= 9 && var <= 11) {
            System.out.println("Autumn");
        } else System.out.println("Winter");
    }
}
