package az.atlacademy.module01.lesson18_p3;

import java.io.Serializable;
import java.util.Set;

public class Person implements Serializable {
    public int id;
    public int age;
    public String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
