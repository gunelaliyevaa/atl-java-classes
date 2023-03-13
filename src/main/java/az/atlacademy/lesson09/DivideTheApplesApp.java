package az.atlacademy.lesson09;

import java.util.Scanner;

public class DivideTheApplesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int r = k / n;
        System.out.println(r);
    }
}
