package org.example;

public interface Flyable {
    public void fly();
}

class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("With wings");
    }
}

class Aeroplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("With fuel");
    }
}