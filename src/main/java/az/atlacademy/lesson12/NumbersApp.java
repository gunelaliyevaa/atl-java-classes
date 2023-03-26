package az.atlacademy.lesson12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;

public class NumbersApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> guessedNumbers = new ArrayList<>();
        Comparator<Integer> reverseOrder = Collections.reverseOrder();
        System.out.println("Let the game begin!");

        String[][] events = {
                {"When did the World War II begin?", "1939"},
                {"When did the Titanic sink?", "1912"},
                {"When did the United States declare independence?", "1776"},
                {"When did the first moon landing occur?", "1969"},
                {"When was the first iPhone released?", "2007"},
                {"When did the Chernobyl disaster occur?", "1986"},
                {"When was the first Harry Potter book published?", "1997"},
                {"When was the first successful human heart transplant performed?", "1967"},
                {"What year was the discovery of penicillin announced?", "1928"},
                {"What year did the Hubble Space Telescope launch into orbit?", "1990"},
                {"What year did the James Webb Space Telescope launch into orbit?", "2021"}

        };
        boolean playAgain = true;
        while (playAgain) {
            //gets random indexed Q&A from 2D array called "events"
            int randomRow = (int) (Math.random() * events.length);
            //creates a new 1D array called "randomEvent" with question and answer separately being elements
            String[] randomEvent = events[randomRow];
            //the question is index 0 and answer is index 1 of 1D array "randomEvent"
            String question = randomEvent[0];
            String answer = randomEvent[1];

            System.out.println("Please, enter your name.");
            String name = scan.nextLine();

            System.out.println("Guess the answer!");
            System.out.println(question);
            while (true) {
                try {
                    int number = scan.nextInt();
                    guessedNumbers.add(number);
                    guessedNumbers.sort(reverseOrder);
                    System.out.println("Your numbers: " + guessedNumbers);

                    if (number < Integer.parseInt(answer)) {
                        System.out.println("Your number is too small. Please, try again.");
                    } else if (number > Integer.parseInt(answer)) {
                        System.out.println("Your number is too big. Please, try again.");
                    } else {
                        System.out.print("Congratulations, " + name + "!\n");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number.");
                    scan.next();
                }
            }
            System.out.println("Do you want to play again? (Yes/No)");
            String response = scan.next();

            if (response.equalsIgnoreCase("No")) {
                playAgain = false;
            }
            scan.nextLine(); //to consume the remaining newline character \n
        }
        System.out.println("Thanks for playing!");
    }
}
