package az.atlacademy.module01.lesson10.mixedhomework4;

import java.util.Scanner;

public class DollarsInBankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long S = input.nextLong();
        long total = 1;
        long dollars = 1;
        long N = 1;

        while (total < S) {
            N++;
            dollars = (2 * dollars) + N;
            total += dollars;
        }
        System.out.println(N);
    }
}