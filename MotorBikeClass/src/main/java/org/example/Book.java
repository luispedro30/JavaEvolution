package org.example;

public class Book {
    private int noOfCopies;

    Book (){
        this.noOfCopies = 50;
    }

    Book(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }
    public void setNoOfCopies(int noOfCopies){
        if (this.noOfCopies > 0){
            this.noOfCopies = noOfCopies;
        }
    }

    public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies - howMuch);
    }
    int getNoOfCopies(){
        return this.noOfCopies;
    }
}
