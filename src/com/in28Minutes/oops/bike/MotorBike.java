package com.in28Minutes.oops.bike;

import lombok.Data;

@Data
public class MotorBike {
    private int speed;

    public MotorBike(int i) {
        this.speed = i;
    }

    void start() {
        System.out.println("Bike Started");
    }

   public void increaseSpeed(int howMuch) {
        this.speed = this.speed + howMuch;
    }

    public void decreaseSpeed(int howMuch) {
        this.speed = this.speed - howMuch;
    }
}
