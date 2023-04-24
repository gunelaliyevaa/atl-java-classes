package az.atlacademy.module01.lesson05_quiz1;

import java.util.Scanner;

public class MaximumElement2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];

        int max = nums[0];
        int indexOfMax = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int currentElement = nums[i];
            if (currentElement >= max) {
                max = currentElement;
                indexOfMax = i;
            }
        }
        System.out.println(max);
        System.out.println(indexOfMax);
    }
}
