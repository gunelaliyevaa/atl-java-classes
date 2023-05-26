package az.atlacademy.module01.lesson18_p3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.xml.XmlMapper;

import java.io.IOException;

public class JsonApp {

    public static void main(String[] args) {
        Person person = new Person(55, 20, "Lunar");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String lunarJson = objectMapper.writeValueAsString(person);
            System.out.println(lunarJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            XmlMapper objectMapper = new XmlMapper();
            String lunarXml = objectMapper.writeValueAsString(person);
            System.out.println(lunarXml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
