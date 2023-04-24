package az.atlacademy.module01.lesson18;

public class ObjectApp {
    public static void main(String[] args) {
        System.out.println(1 == 1);

        Person person1 = new Person(18, 1_000_000);
        System.out.println(person1);

        Person person2 = new Person(24, -1_000_000);
        System.out.println(person2.toString());
        System.out.println(Integer.toHexString(person2.hashCode()));

        System.out.println(person2 == person1);

        Person person3 = new Person(24, -1_000_000);
        System.out.println(person2);
        System.out.println(person2 == person3);
        boolean isEqual = person2.equals(person3); // person2 == person3
        System.out.println(isEqual);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        int[] ints = {1};
        System.out.println(ints.hashCode());
    }
}
