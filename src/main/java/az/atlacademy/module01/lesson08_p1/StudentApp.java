package az.atlacademy.module01.lesson08_p1;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student(20, 76.5);
        System.out.println(student1.getAge());
        System.out.println(student1.getGrade());

        System.out.println(student1);
        System.out.println(student1.hashCode());
        System.out.println(student1.hashCode());

        student1 = null;

        System.out.println(student1);

        int[] nums = {1};
        System.out.println(nums.toString());
        System.out.println(Arrays.toString(nums));

        Student student = new Student(24, 51);
        System.out.println(student);
    }
}
