package az.atlacademy.module01.lesson14;

import java.util.Comparator;

public class CompareStudents implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        if (st1.grade != st2.grade) {
            return -Double.compare(st1.grade, st2.grade);
        } else if (!st1.name.equals(st2.name)) {
            return st1.name.compareTo(st2.name);
        }
        return st1.compareTo(st2);
    }
}
