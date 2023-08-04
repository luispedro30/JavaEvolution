package org.example;

import java.util.ArrayList;

public class Livro {

    private int id;
    private String name;
    private String author;

    private ArrayList<Review> reviews = new ArrayList<>();

    public Livro (int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview (Review review){
        this.reviews.add(review);
    }

}
