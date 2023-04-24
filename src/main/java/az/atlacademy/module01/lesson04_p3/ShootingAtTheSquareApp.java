package az.atlacademy.module01.lesson04_p3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShootingAtTheSquareApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] square = new int[5][5];
        // Random target
        int randomRow = (int) (Math.random() * 5);
        int randomCol = (int) (Math.random() * 5);

        int rowInput = 0;
        int colInput;
        int target = 1;
        boolean key = true;
        boolean targetFound = false;
        System.out.println(randomRow);
        System.out.println(randomCol);
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            try {

               if (key) { //????
                    System.out.println("Please, enter a line number.");
                    rowInput = scan.nextInt() - 1;   // Line number
                    if (rowInput > 4 || rowInput < 0) {
                        System.out.println("Please enter a valid number.");
                        scan.nextLine();
                        continue;
                    }
               }

                System.out.println("Please, enter a shooting bar number.");
                 colInput = scan.nextInt() - 1; // Shooting bar number
                if (colInput > 4 || colInput < 0) {
                    System.out.println("Please enter a valid number.");
                    key = false;
                    scan.nextLine();
                    continue;
                }
                key = true;

                if (rowInput == randomRow && colInput == randomCol) {
                    square[randomRow][randomCol] = target; 
                } else {
                    square[rowInput][colInput] = -1;
                }

                for (int row = 0; row < 5; row++) {
                    for (int col = 0; col < 5; col++) {
                        if (square[row][col] == 0) {
                            System.out.print("- "); // Not shot
                        } else if (square[row][col] == -1) {
                            System.out.print("* "); // Shot, not target
                        } else if (square[row][col] == 1) {
                            System.out.print("x "); // Target
                            targetFound = true;
                        }
                    }
                    System.out.println();
                }
                if (targetFound) {
                    System.out.println("You have won!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scan.nextLine();
            }
        }
    }
}


