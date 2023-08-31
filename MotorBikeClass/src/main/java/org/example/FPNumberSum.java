package org.example;

import java.util.List;

public class FPNumberSum {
    public static void main(String[] args) {
        List<Integer> listNumbers = List.of(1,23,45,5);
        System.out.println(sumNumber(listNumbers));
    }

    public static Integer sumNumber(List<Integer> list){
        return list.stream().reduce(0, (number1, number2) -> number1 + number2);
    }
}
