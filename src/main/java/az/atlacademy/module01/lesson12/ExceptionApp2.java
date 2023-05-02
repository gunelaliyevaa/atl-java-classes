package az.atlacademy.module01.lesson12;

import java.util.Scanner;

public class ExceptionApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        String number2 = scan.next();
        int num = 0;
        int num2 = 0;

        try {
            num = Integer.parseInt(number);
            num2 = Integer.parseInt(number2);
            System.out.println(num / num2);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
         // OR NumberFormatException | ArithmeticException  together RuntimeException (Swallowing exception)
        /*} catch (ArithmeticException e) {
            System.out.println("ArithmeticException thrown!");
        }*/
    }
}
