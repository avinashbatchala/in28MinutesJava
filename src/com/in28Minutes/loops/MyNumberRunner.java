package com.in28Minutes.loops;

public class MyNumberRunner {
   static MyNumber number = new MyNumber(10);

    public static void main(String[] args) {
        System.out.println(number.isPrime());
        System.out.println(number.sumUptoN());
        number.printNumTriangle();
    }
}
