package com.in28Minutes.reftypes.stringtype;

public class IndividualChar {
    public static void main(String[] args) {
        String str = "This is a sample text";

        for(int i = 0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
