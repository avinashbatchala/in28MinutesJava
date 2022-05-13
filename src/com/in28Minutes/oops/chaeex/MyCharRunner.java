package com.in28Minutes.oops.chaeex;

public class MyCharRunner {
   static MyChar aChar = new MyChar('a');
    public static void main(String[] args) {
        System.out.println(aChar.isVowel() + " " + "isVowel");
        System.out.println(aChar.isDigit() + " " + "isDigit");
        System.out.println(aChar.isAlphabet() + " " + "isAlphabet");
//        aChar.printLowerCaseAlpha();
//        aChar.printUpperCaseAlpha();
        System.out.println(aChar.isConsonant() + " " + "isConsonant");
    }
}
