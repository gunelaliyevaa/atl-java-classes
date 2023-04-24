package az.atlacademy.module01.lesson04_p1;

import java.util.Scanner;
import java.util.Random;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(5);
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(20);
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.printf(arr[i] + " ");
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.printf(arr[i] + " ");
            }
        }
    }
}
