package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListOfNumbers {

    public List<Integer> numbers = List.of(123,12,3,45);
    public List<Integer> arrayListNumbers = new ArrayList<>(numbers);

    public static void main(String[] args) {
        SortListOfNumbers sortList = new SortListOfNumbers();
        System.out.println(sortList.arrayListNumbers);
        Collections.sort(sortList.arrayListNumbers);
        System.out.println(sortList.arrayListNumbers);
    }
}
