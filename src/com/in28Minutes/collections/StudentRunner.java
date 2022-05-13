package com.in28Minutes.collections;

public class StudentRunner {
    public static void main(String[] args) {
//        int[] marks = {100, 98, 67, 90, 99, 100};
        Student student = new Student("Avinash", 10,99,99,100,99,99);

        System.out.println(student.getNumberOfMarks());
        System.out.println(student.getSumOfMarks());
        System.out.println(student.getMaximumMark());
        System.out.println(student.getMinimumMark());
        System.out.println(student.getAverage());
        student.addMark(75);
        System.out.println(student.toString());
    }
}
