package com.in28Minutes.oops.numbers;

public class NumbersRunner {
    static Numbers one = new Numbers(5, 6);

    public static void main(String[] args) {
        System.out.println(one.addNumbers());
        System.out.println(one.subtractNumbers());
        System.out.println(one.multiply());
        one.doubleNumbers();
        System.out.println(one.getNum1());
        System.out.println(one.getNum2());

    }
}
