package org.example;

public class BookRunner {

    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        System.out.println(artOfComputerProgramming.name);
        System.out.println(effectiveJava.name);
        System.out.println(cleanCode.name);
    }
}
