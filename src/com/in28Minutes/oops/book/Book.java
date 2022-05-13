package com.in28Minutes.oops.book;

import lombok.Data;

@Data
public class Book {
    private int noOfCopies;

    public Book(int initCopies) {
        this.noOfCopies = initCopies;
    }

    public void increaseCopies(int increase) {
        this.noOfCopies = this.noOfCopies + increase;
    }

    public void decreaseCopies(int decrease) {
        this.noOfCopies = this.noOfCopies - decrease;
    }
}
