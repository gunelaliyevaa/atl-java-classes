package az.atlacademy.module01.lesson10.mixedhomework4;

import java.util.Scanner;

public class SumAndAmountApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;

        while (scan.hasNext()) {
            int n = scan.nextInt();
            sum += n;
            cnt++;
        }
        System.out.printf("%d %d", cnt, sum);
    }
}