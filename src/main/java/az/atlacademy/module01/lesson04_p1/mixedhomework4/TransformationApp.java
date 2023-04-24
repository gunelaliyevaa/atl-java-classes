package az.atlacademy.module01.lesson04_p1.mixedhomework4;

import java.util.Scanner;

public class TransformationApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int cnt = 0;
        while (n != 1 && n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n + 1;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
