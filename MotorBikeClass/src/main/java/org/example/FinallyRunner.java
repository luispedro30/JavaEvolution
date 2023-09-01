package org.example;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matched ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Before Scanner closed");
            scanner.close();
            System.out.println("Scanner closed");
        }
    }
}
