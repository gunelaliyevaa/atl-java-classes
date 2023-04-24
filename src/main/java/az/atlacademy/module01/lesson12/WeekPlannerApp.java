package az.atlacademy.module01.lesson12;

import java.util.Scanner;

public class WeekPlannerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] schedule = new String[7][2];

        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "meet with friends";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "work on project";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to the gym";
        schedule[5][0] = "Friday";
        schedule[5][1] = "attend a meeting";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "listen to music; read a book";

        boolean exit = true;
        while (true) {
            System.out.println("Please, input the day of the week:");
            String weekday = scan.next().trim().toLowerCase();

            switch (weekday) {
                case "sunday":
                    System.out.println("Your tasks for " + weekday.substring(0, 1).toUpperCase() + weekday.substring(1) + ": " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your tasks for " + weekday.substring(0, 1).toUpperCase() + weekday.substring(1) + ": " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for " + weekday.substring(0, 1).toUpperCase() + weekday.substring(1) + ": " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for " + weekday.substring(0, 1).toUpperCase() + weekday.substring(1) + ": " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for " + weekday.substring(0, 1).toUpperCase() + weekday.substring(1) + ": " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for " + weekday.substring(0, 1).toUpperCase() + weekday.substring(1) + ": " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for " + weekday.substring(0, 1).toUpperCase() + weekday.substring(1) + ": " + schedule[6][1]);
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    scan.nextLine();
            }
            if (!exit) {
                break;
            }
        }
    }
}


