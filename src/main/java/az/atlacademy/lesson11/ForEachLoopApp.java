package az.atlacademy.lesson11;

import java.util.stream.IntStream;

public class ForEachLoopApp {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100).forEach(System.out::println);
    }
}
