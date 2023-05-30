package az.atlacademy.module01.lesson19;

import java.io.Serializable;
import java.time.LocalDate;

public final class Student implements Serializable {

    public static final long serialVersionUID = 42;

    public long id;
    public String name;
    public double grade;
    public transient LocalDate date;

    public Student() {
    }

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=%d, name='%s', grade=%s, date=%s}".formatted(id, name, grade, date);
    }
}
