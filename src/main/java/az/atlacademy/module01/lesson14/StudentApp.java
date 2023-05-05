package az.atlacademy.module01.lesson14;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] student = {
                new Student(77, 95, "Maya"),
                new Student(51, 92, "Ava"),
                new Student(47, 95, "Marcus"),
                new Student(27, 86, "Jasmine")
        };

        System.out.println(Arrays.toString(student));
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

        System.out.println("***");

        System.out.println(Arrays.toString(student));
        Arrays.sort(student, new CompareStudents());
        System.out.println(Arrays.toString(student));

        System.out.println("***");

        System.out.println(Arrays.toString(student));
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.grade != st2.grade) {
                    return -Double.compare(st1.grade, st2.grade);
                } else if (!st1.name.equals(st2.name)) {
                    return st1.name.compareTo(st2.name);
                }
                return st1.compareTo(st2);
            }
        });
        System.out.println(Arrays.toString(student));

        System.out.println("***");

        System.out.println(Arrays.toString(student));
        Arrays.sort(student, (st1, st2) -> {
            if (st1.grade != st2.grade) {
                return Double.compare(st2.grade, st1.grade);
            } else if (!st1.name.equals(st2.name)) {
                return st2.name.compareTo(st1.name);
            }
            return st1.compareTo(st2);
        });
        System.out.println(Arrays.toString(student));
    }
}
