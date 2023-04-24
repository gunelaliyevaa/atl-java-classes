package az.atlacademy.module01.lesson07.encapsulation;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student(24, "Student1", new String[]{"Math", "CS"});
        System.out.println(student1.getAge());
        System.out.println(student1.getName());
        System.out.println(Arrays.toString(student1.getCourses()));
        String[] courses = student1.getCourses();
        courses[0] = null;
        courses = null;
        System.out.println(Arrays.toString(student1.getCourses()));
    }
}
