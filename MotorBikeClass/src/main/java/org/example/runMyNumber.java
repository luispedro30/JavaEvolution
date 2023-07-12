package org.example;

public class runMyNumber {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(9);

        boolean isPrime = number.isPrime();
        System.out.println(isPrime);

        int sum = number.sumUptoN();
        System.out.println(sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println(sumOfDivisors);
        number.printANumberTriangle();
    }
}
