package az.atlacademy.module01.lesson18_p3;

import az.atlacademy.module01.lesson18_p2.StudentFileApp;

import java.io.*;

public class PersonFileApp {
    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson18_p3/resource/";


    public static void main(String[] args) {
        Person person1 = new Person(5577, 20, "Someone");
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "person.ser")))) {
            oos.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(RESOURCE + "person.ser")))) {

            Object object = ois.readObject();
            if (object instanceof Person) {
                Person person = (Person) object;
                System.out.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
