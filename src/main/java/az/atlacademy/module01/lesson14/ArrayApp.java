package az.atlacademy.module01.lesson14;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] nums = {10, 11, 3, 2, 7};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
