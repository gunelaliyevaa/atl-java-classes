package az.atlacademy.lesson08;

import java.util.Scanner;

public class SumOfEvenDigitsApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                res += rem;
            }
            num = num / 10;
        }
        System.out.println(res);
    }
}
