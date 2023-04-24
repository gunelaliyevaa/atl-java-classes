package az.atlacademy.module01.lesson03_p1;

import java.util.Scanner;

public class StringOperationsApp{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.trim());
        System.out.println( word.substring(0, 1).toUpperCase() + word.substring(1));
    }
}
