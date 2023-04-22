package az.atlacademy.module01.lesson13;

import java.util.Arrays;

public class MethodsApp {
    public static int[] fillWith(int size) {
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 11);
        }
        return nums;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        printArray(fillWith(5));
    }
}
