package az.atlacademy.lesson10.mixedhomework4;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        int element = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = element;
                element++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}

