package az.atlacademy.module01.lesson17_p3;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumListApp {

    public static void main(String[] args) {
        List<Integer> evenNums = new Random()
                .ints(20, 1, 50)
                .filter(num -> num % 2 == 0)
                .boxed()
                .collect(Collectors.toList()); // Without line 15, the list won't be created because types are primitive

        System.out.println(evenNums);

        Set<Integer> filteredNums = evenNums
                .stream()
                .filter(num -> num > 10 && num < 30)
                .collect(Collectors.toSet());

        System.out.println(filteredNums);
    }

}

