package org.example;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FPNumberSum {
    public static void main(String[] args) {
        List<Integer> listNumbers = List.of(1,23,45,5);
        List<String> listString = List.of("AB","CD");
        //System.out.println(sumNumber(listNumbers));
        squares(listNumbers);
        lower(listString);
        length(listString);
        System.out.println(maxInteger(listNumbers));
        System.out.println(minInteger(listNumbers));
        System.out.println(squaresList(listNumbers));
    }


    public static Integer sumNumber(List<Integer> list){
        return list.stream().reduce(0, (number1, number2) -> number1 + number2);
    }

    public static void squares(List<Integer> list){
        list.stream().map(elem -> elem * elem).forEach(elem -> System.out.println(elem));
    }

    public static Integer maxInteger(List<Integer> list){
        return list.stream().max(Integer::compareTo).orElseThrow();
    }

    public static Integer minInteger(List<Integer> list){
        return list.stream().min(Integer::compareTo).orElseThrow();
    }

    public static void lower(List<String> list){
        list.stream().map(elem -> elem.toLowerCase()).forEach(elem -> System.out.println(elem));
    }

    public static void length(List<String> list){
        list.stream().map(elem -> elem.length()).forEach(elem -> System.out.println(elem));
    }

    public static List<Integer> squaresList(List<Integer> list){
        return list.stream().map(elem -> elem * elem).collect(Collectors.toList());
    }
}
