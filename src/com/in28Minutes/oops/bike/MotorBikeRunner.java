package com.in28Minutes.oops.bike;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(12);
        MotorBike honda = new MotorBike(12);

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        honda.setSpeed(80);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        System.out.println("Increasing speed");

        ducati.increaseSpeed(50);
        honda.increaseSpeed(1);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        System.out.println("Decreasing Speed");

        ducati.decreaseSpeed(100);
        honda.decreaseSpeed(115);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
