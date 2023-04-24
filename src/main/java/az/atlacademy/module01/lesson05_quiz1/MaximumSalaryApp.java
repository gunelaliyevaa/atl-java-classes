package az.atlacademy.module01.lesson05_quiz1;

import java.util.Scanner;

public class MaximumSalaryApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maxSalary = -1;
        double salary;

        while (scan.hasNext()) {
            salary = scan.nextDouble();
            maxSalary = Math.max(salary, maxSalary);
        }
        System.out.printf("%.2f", maxSalary);
    }
}
