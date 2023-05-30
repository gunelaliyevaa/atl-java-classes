package az.atlacademy.module01.lesson19;

import az.atlacademy.module01.lesson18_p3.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PersonReflectionApp {

    public static void main(String[] args) {
        Person person = new Person(1, 20, "thisName");
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        Method[] methods = personClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        Constructor[] constructors = person.getClass().getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));

        System.out.println(Arrays.toString(person.getClass().getInterfaces()));

    }

}
