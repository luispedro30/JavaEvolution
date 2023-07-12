package org.example;

public class MyNumber {

    private int number;

    public MyNumber (int argNumber){
        this.number = argNumber;
    }

    public boolean isPrime(){
        //2 to number -1, 0 or 1 are not prime

        if (this.number <2){
            return false;
        }
        if (number % 2 == 0){
            return false;
        } else {
            return true;
        }
    };

     int sumUptoN(){
        int sum = 0;
        for (int i = 1; i <= this.number; i++){
            sum += i;
        }
        return sum;
    };

     int sumOfDivisors(){
        int sumOfDivisors = 0;
        //except 1 and the actual number
        for (int i = 2; i <= this.number-1; i++){
            if (this.number % i == 0){
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors;
    };

     void printANumberTriangle(){
        for (int i = number; i>=1; i--){
            for (int j = 1; j <= this.number-i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
