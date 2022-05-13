package com.in28Minutes.oops.book;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(500);
        Book effectiveJava = new Book(100);
        Book cleanCode = new Book(513);

        artOfComputerProgramming.setNoOfCopies(50);
        effectiveJava.setNoOfCopies(5466);
        cleanCode.setNoOfCopies(788);


    }
}
