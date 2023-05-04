package az.atlacademy.module01.lesson14;

import static java.lang.Math.random;

public class NumberIsEvenApp {
    public static void main(String[] args) {
        Box<Integer> resultBox = generateAndCheckNum();
        //System.out.println(resultBox.getData());
        System.out.println(resultBox.isEven());
        System.out.println(resultBox);
        //System.out.println(resultBox.toString());
        System.out.println(resultBox.hashCode());

    }

    public static Box<Integer> generateAndCheckNum() {
        int num = (int) (random() * 100);
        boolean isEven = num % 2 == 0;
        return new Box<>(isEven, num);
    }
}
