package com.in28Minutes.loops;

public class MyNumber {
    int num;
    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isPrime() {
        int count = 1;
        for(int i=1; i < num; i++) {
            if((num%i)==0) {
                count ++;
            }
            if(count>2) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return sum;
    }

    public void printNumTriangle() {
        for(int i =1; i<=num; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

