package az.atlacademy.module01.lesson14_p2;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (!p1.name.equals(p2.name)) {
            return p1.name.compareTo(p2.name);
        } else if (p1.age != p2.age) {
            return Integer.compare(p1.age, p2.age);
        }
        return -Double.compare(p1.salary, p2.salary);
    }
}
