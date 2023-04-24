package az.atlacademy.module01.lesson04_p3;

import java.util.Scanner;

public class NumbersMainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        System.out.println("Let the game begin!");
        System.out.println("Please, enter your name.");
        String name = scan.nextLine();

        System.out.println("Guess the number!");
        while (true) {
            int guessed = scan.nextInt();

            if (guessed < number) {
                System.out.println("Your guessed is too small. Please, try again.");
            } else if (guessed > number) {
                System.out.println("Your guessed is too big. Please, try again.");
            } else {
                System.out.print("Congratulations, " + name + "!\n");
                break;
            }
        }
    }
}
