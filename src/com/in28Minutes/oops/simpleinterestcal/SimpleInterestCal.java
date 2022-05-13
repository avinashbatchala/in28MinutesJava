package com.in28Minutes.oops.simpleinterestcal;

public class SimpleInterestCal {
    int principal; double years; double intrst;

    public SimpleInterestCal(int principal, double years, double intrst) {
        this.principal = principal;
        this.years = years;
        this.intrst = intrst;
    }

    public double calcTotal() {
        return (principal + (principal*years*(intrst/100)));
    }

    public double calcInterest() {
        return principal*years*intrst/100;
    }
}
