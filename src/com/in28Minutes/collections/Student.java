package com.in28Minutes.collections;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Student {
    private ArrayList<Integer> marks = new ArrayList<Integer>();
    private String name;

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        return Collections.max(marks);
    }

    public int getMinimumMark() {
        return Collections.min(marks);
    }

    public BigDecimal getAverage() {
        int sum = getSumOfMarks();
        int num = getNumberOfMarks();
        BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(num), RoundingMode.HALF_UP);

        return avg;
    }

    public String toString() {
        return name + marks;
    }

    public void addMark(int mark) {
        marks.add(mark);
    }


}
