package org.example;

import java.util.Set;

public class SetOfStrings {

    private Set<String> set = Set.of("Apple","Banana","Cat");
    public static void main(String[] args) {
        SetOfStrings setOfstring = new SetOfStrings();

        System.out.println(setOfstring.set);
    }
}
