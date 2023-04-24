package az.atlacademy.module01.lesson03_p2;

import java.util.Scanner;

public class ForLoopApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = 0;
        for (int i = 0; i < 4; i++) {
            res += num % 10;
            num = num / 10;
        }
        System.out.println(res);
    }
}
