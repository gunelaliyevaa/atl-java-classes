package az.atlacademy.module01.lesson05;

public class RelationalOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean result1 = (a == b);
        boolean result2 = (a != b);
        boolean result3 = (a < b);
        boolean result4 = (a > b);
        boolean result5 = (a <= b);
        boolean result6 = (a >= b);

        System.out.println("a == b: " + result1);
        System.out.println("a != b: " + result2);
        System.out.println("a < b: " + result3);
        System.out.println("a > b: " + result4);
        System.out.println("a <= b: " + result5);
        System.out.println("a >= b: " + result6);
    }
}
