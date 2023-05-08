package az.atlacademy.module01.lesson14_p2;

public class Person implements Comparable<Person> {
    public int id;
    public int age;
    public String name;
    public double salary;

    public Person(int id, int age, String name, double salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.id, that.id);
    }

    @Override
    public String toString() {
        return "PersonComparator{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

