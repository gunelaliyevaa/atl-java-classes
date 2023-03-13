package az.atlacademy.lesson09;

import java.util.Scanner;
public class SimpleProblemApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        System.out.println(n / 10);
        System.out.println(n % 10);
    }
}
