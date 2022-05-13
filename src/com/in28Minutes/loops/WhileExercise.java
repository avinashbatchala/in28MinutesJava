package com.in28Minutes.loops;

public class WhileExercise {
  private int limit;

    public WhileExercise(int limit) {
        this.limit = limit;
    }

    public void printSquaresUptoLimit () {
        int flag = 1;
        while (flag*flag < limit) {
            System.out.print(flag*flag + " ");
            flag++;
        }
        System.out.println(" ");
    }

    public void printCubesUptoLimit() {
        int flag = 1;
        while (flag*flag*flag < limit) {
            System.out.print(flag*flag*flag + " ");
            flag++;
        }
    }
}
