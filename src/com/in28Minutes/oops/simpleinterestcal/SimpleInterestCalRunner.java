package com.in28Minutes.oops.simpleinterestcal;

public class SimpleInterestCalRunner {
   static SimpleInterestCal total = new SimpleInterestCal(1250, 2.5, 7.5);

    public static void main(String[] args) {
        System.out.println(total.calcTotal());
        System.out.println(total.calcInterest());
    }
}
