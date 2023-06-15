package org.example;

public class MotorBike {
    //state
    private int speed;

    //behaviour

    int getSpeed(){
        //System.out.println(speed);
        return speed;
    }

    void setSpeed(int value){
        this.speed = value;
    }
    void start(){
        System.out.println("Bike started");
    }

    void stop(){
        System.out.println("Bike stopped");
    }
}
