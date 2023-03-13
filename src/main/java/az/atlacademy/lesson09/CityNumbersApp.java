package az.atlacademy.lesson09;

import java.util.Scanner;

public class CityNumbersApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        if ((n % 2 == 1 && m % 2 == 1) || (n % 2 == 0 && m % 2 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
