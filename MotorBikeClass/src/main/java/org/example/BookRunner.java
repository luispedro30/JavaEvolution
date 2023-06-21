package org.example;

public class BookRunner {

    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(100);
        Book cleanCode = new Book(100);

        artOfComputerProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);

        System.out.println(artOfComputerProgramming.getNoOfCopies());
    }
}
