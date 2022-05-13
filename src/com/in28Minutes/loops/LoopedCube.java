package com.in28Minutes.loops;

import java.util.Scanner;

public class LoopedCube {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while (num>=0) {
            System.out.println("Enter a Number: ");
             num = scanner.nextInt();
            System.out.println("Cube is " + (num*num*num));
        }
        System.out.println("Thank you");
    }
}
