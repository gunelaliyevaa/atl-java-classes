package az.atlacademy.module01.lesson04_p1.mixedhomework4;

import java.util.Scanner;

public class IncreaseBy2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > 0) {
                arr[i] += 2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

