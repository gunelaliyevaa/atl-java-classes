package az.atlacademy.module01.lesson05_quiz1;

import java.util.Scanner;

public class GreatestOfNeighborsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] > arr[i + 1]) && (arr[i] > arr[i - 1])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
