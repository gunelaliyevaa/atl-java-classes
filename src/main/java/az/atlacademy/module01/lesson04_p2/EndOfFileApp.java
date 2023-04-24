package az.atlacademy.module01.lesson04_p2;

import java.util.Scanner;

public class EndOfFileApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int num = scan.nextInt();
            System.out.println("element is: " + num);
        }
    }
}
