package org.example;

public class runMyChar {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('b');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isConsonant());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
        MyChar.printLowerCaseAlphabets();

    }
}
