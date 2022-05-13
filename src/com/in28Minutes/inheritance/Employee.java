package com.in28Minutes.inheritance;

import lombok.Data;

@Data
public class Employee extends Person {
    private String title;
    private String employer;
    private String employeeGrade;
    private int salary;

    public Employee(String name) {
        setName(name);
    }

    public String toString() {
        return String.format("name- %s title- %s", getName(), title);
    }
}
