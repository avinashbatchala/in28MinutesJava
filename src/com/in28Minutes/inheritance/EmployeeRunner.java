package com.in28Minutes.inheritance;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Avinash");
        employee1.setTitle("SW");
        employee1.setEmployeeGrade("1");
        System.out.println(employee1);
    }
}
