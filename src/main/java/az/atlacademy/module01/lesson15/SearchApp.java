package az.atlacademy.module01.lesson15;


import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class SearchApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] nums = new int[(int) (Math.random() * 10)];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(nums);

        Optional<Integer> res = checkArray(num, nums);
        System.out.println(res);
    }

    //public static Optional<Integer> checkArray(int[] arr, int num) {
    public static <T> Optional<Integer> checkArray(int given, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == given) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}


