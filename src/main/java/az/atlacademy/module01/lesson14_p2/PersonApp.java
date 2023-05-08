package az.atlacademy.module01.lesson14_p2;

import java.util.Arrays;
import java.util.Comparator;

public class PersonApp {
    public static void main(String[] args) {
        Person[] person = {
                new Person(2, 25, "Maya", 1200),
                new Person(4, 30, "Ava", 3000),
                new Person(1, 21, "Marcus", 3000),
                new Person(3, 28, "Jasmine", 6500)
        };

        System.out.println(Arrays.toString(person));
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));

        System.out.println("***");

        System.out.println(Arrays.toString(person));
        Arrays.sort(person, new PersonComparator());
        System.out.println(Arrays.toString(person));

        System.out.println("***");

        System.out.println(Arrays.toString(person));
        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return -Integer.compare(p1.age, p2.age);
            }
        });
        System.out.println(Arrays.toString(person));

        System.out.println("***");

        System.out.println(Arrays.toString(person));
        Arrays.sort(person, (p1, p2) -> Double.compare(p1.salary, p2.salary));
        System.out.println(Arrays.toString(person));
    }
}