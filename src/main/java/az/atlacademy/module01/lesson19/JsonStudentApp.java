package az.atlacademy.module01.lesson19;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JsonStudentApp {
    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson19/resource/";

    public static void main(String[] args) throws RuntimeException {
        Student student1 = new Student(155, "Adam", 90);
        //write
        ObjectMapper objectMapper = new ObjectMapper();
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "student.ser")))) {
            byte[] studentInBytes = objectMapper.writeValueAsBytes(student1);
            oos.writeObject(studentInBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // read
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(RESOURCE + "student.ser")))) {
            byte[] studentInBytes = (byte[]) ois.readObject();
            Student deserializedStudent = objectMapper.readValue(studentInBytes, Student.class);  //1. How do I assign the read object to student without
            System.out.println(deserializedStudent);                                              // creating default empty constructor in student class?
        } catch (IOException | ClassNotFoundException e) {                                        //2. Should we not check with 'instanceof'?
            throw new RuntimeException(e);
        }
    }

}
/*
todo:
 1.Write Student object to file with Object Output Stream
 2.Read Student object from file with Object Input Stream
 3.Use JSON mapper in both operations
*/
