package com.in28Minutes.oopsadvanced;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan1 = new Fan("GE", 12.3, "Black");
        fan1.switchOn();
        fan1.setSpeed((byte) 5);
        System.out.println(fan1);
    }
}
