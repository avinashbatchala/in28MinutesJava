package com.in28Minutes.oops.numbers;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Numbers {
    int num1;
    int num2;

    public Numbers(int i, int j) {
        this.num1 = i;
        this.num2 = j;
    }

    public int addNumbers() {
        return num1 + num2;
    }

    public int subtractNumbers() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public void doubleNumbers() {
        this.num1 *= 2;
        this.num2 *= 2;

    }

}
