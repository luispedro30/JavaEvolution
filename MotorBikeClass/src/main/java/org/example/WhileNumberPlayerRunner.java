package org.example;

public class WhileNumberPlayerRunner {
    public static void main(String[] args) {
        WhileNumberPlayer numberPlayer = new WhileNumberPlayer(30);

        numberPlayer.printSquaresUptoLimit();

        numberPlayer.printCubesUptoLimit();
    }
}
