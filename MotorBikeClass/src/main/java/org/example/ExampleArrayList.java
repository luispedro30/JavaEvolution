package org.example;

import javax.sound.midi.Soundbank;
import java.util.List;

public class ExampleArrayList {

    public List<String> Words = List.of("Apple", "Bat", "Cat");

    public void listCharacteristics(){
        System.out.println(Words.size());
        System.out.println(Words.isEmpty());
    }

    public static void main(String[] args) {
        ExampleArrayList arrayExample = new ExampleArrayList();
        arrayExample.listCharacteristics();
    }
}
