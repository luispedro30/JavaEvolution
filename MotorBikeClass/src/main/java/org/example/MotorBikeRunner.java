package org.example;

public class MotorBikeRunner
{
    public static void main(String[] args) {
        MotorBike honda = new MotorBike(100);
        MotorBike ducati = new MotorBike(50);
        honda.start();
        ducati.start();

        ducati.setSpeed(100);
        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(50);
        honda.setSpeed(80);
        honda.increaseSpeed(20);

        //ducati.setSpeed(20);
        //honda.setSpeed(0);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}