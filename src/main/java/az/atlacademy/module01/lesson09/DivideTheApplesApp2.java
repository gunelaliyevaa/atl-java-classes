package az.atlacademy.module01.lesson09;

import java.util.Scanner;

public class DivideTheApplesApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int res = k % n;
        System.out.println(res);
    }
}
