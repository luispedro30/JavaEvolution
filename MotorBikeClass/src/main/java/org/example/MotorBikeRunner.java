package org.example;

public class MotorBikeRunner
{
    public static void main(String[] args) {
        MotorBike honda = new MotorBike();
        MotorBike ducati = new MotorBike();
        honda.start();
        ducati.start();
    }
}