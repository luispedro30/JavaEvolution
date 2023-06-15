package org.example;

public class MotorBikeRunner
{
    public static void main(String[] args) {
        MotorBike honda = new MotorBike();
        MotorBike ducati = new MotorBike();
        honda.start();
        ducati.start();

        ducati.setSpeed(100);
        honda.setSpeed(80);

        ducati.setSpeed(20);
        honda.setSpeed(0);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}