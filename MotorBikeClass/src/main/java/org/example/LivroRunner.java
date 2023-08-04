package org.example;

public class LivroRunner {
    public static void main(String[] args) {
        Livro livro = new Livro(123, "Object Oriented Programming with Java", "Ranga");
        livro.addReview(new Review (10,"Great Book", 5));
        livro.addReview(new Review (101,"Awesome", 5));
    }
}
