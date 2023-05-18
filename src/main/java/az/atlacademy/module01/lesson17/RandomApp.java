package az.atlacademy.module01.lesson17;

import java.util.Arrays;

public class RandomApp {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }

            sum = sum + numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum / numbers.length);
    }

}
