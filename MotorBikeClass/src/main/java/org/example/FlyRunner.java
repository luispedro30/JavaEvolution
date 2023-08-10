package org.example;

public class FlyRunner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Aeroplane aeroplane = new Aeroplane();

        bird.fly();
        aeroplane.fly();
    }
}
