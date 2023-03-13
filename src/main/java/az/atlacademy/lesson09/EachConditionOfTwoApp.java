package az.atlacademy.lesson09;

import java.util.Scanner;

public class EachConditionOfTwoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 3 == 0 && ((n % 2 == 0) && (n < 100 && n > 9) || (n > -100 && n < -9))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
