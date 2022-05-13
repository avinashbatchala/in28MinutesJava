package com.in28Minutes.oops.chaeex;

public class MyChar {
    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
            return true;
        }
        return false;
    }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57) {
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if((ch >=65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            return true;
        }
        return false;
    }

    public void printLowerCaseAlpha() {
        for(ch = 97; ch <= 122; ch++) {
            System.out.println(ch);
        }
    }

    public void printUpperCaseAlpha() {
        for(ch = 65; ch <=90; ch++) {
            System.out.println(ch);
        }
    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel()) {
            return true;
        }
        return false;
    }


}
