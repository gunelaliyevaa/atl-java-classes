package az.atlacademy.module01.lesson04_p1.mixedhomework4;

import java.util.Scanner;

public class BypassMatrixApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int cnt = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row % 2 == 0) {
                    System.out.print(cnt++ + "\t");
                } else {
                    System.out.print(--cnt + "\t");
                }
            }
            cnt += n;
            System.out.println();
        }
    }
}
