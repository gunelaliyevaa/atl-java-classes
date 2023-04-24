package az.atlacademy.module01.lesson03_p4;

import java.util.Scanner;

public class PerimeterOfRectangleApp {
    public static void main(String[] args) {
        Scanner parameter = new Scanner(System.in);
        int a = parameter.nextInt();
        int b = parameter.nextInt();

        int p = (a + b) * 2;
        System.out.println(p);


    }
}
