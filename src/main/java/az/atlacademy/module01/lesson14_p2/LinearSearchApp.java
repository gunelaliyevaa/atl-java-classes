package az.atlacademy.module01.lesson14_p2;

import az.atlacademy.module01.lesson13.InvalidObjectException;

import java.util.Optional;
import java.util.Scanner;

public class LinearSearchApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[15];

        int n = scan.nextInt();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.println(nums[i]);
        }

        System.out.println(checkArray(nums, n));
    }

    public static Optional<Integer> checkArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}

