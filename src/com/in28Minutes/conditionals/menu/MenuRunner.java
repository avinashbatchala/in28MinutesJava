package com.in28Minutes.conditionals.menu;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number One: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Number Two: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an option: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");

        int op = scanner.nextInt();

        performOpUsingNestedIf(num1, num2, op);
    }

    private static void performOpUsingNestedIf(int num1, int num2, int op) {
        if (op == 1) {
            System.out.println(num2 + num1);
        } else if (op == 2) {
            System.out.println(num1 - num2);
        }else if (op == 3) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Choose a valid option");
        }
    }
}
