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
        if (value > 0) {
            this.speed = value;
        }
    }

    void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }

    void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
    void start(){
        System.out.println("Bike started");
    }

    void stop(){
        System.out.println("Bike stopped");
    }
}
