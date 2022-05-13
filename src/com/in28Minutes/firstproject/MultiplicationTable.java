package com.in28Minutes.firstproject;

public class MultiplicationTable {

    void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", 5, i, 5 * i).println();
        }
    }

    void print(int num) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d", num, i, i * num).println();
//        }
        print(4,5,10);
    }

    void print(int num, int from, int to) {
        for(int i = from; i <= to; i++) {
            System.out.printf("%d x %d = %d", num, i, num*i).println();
        }
    }
}
