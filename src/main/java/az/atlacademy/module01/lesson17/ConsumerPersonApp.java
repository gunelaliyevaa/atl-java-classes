package az.atlacademy.module01.lesson17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;

public class ConsumerPersonApp {

    public static void main(String[] args) {

        Person person1 = new Person(1, "A");
        Person person2 = new Person(2, "B");
        Person person3 = new Person(3, "C");

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Consumer<Collection> printPerson = new Consumer<Collection>() {
            @Override
            public void accept(Collection collection) {
                System.out.println(collection);
            }
        };

        printPerson.accept(personList);
    }

}
