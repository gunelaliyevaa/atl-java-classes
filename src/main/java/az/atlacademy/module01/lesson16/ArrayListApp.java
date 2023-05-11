package az.atlacademy.module01.lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println(nums);

        nums.set(0, 0);
        System.out.println(nums);

        nums.add(999);
        System.out.println(nums);

        System.out.println(nums.size());
        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(nums);
    }
}
