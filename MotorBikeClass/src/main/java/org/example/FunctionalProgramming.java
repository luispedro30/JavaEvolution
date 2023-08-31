package org.example;

import java.util.List;

public class FunctionalProgramming <T>{
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat","Dog");
        List<Integer> listNumbers = List.of(1,4,7,9);
        printBasicWithFpI(listNumbers);
        printBasicWithFpFiltering(list);
    }

    private static void printBasic(List<String> list){
        for (String string:list){
            System.out.println(string);
        }
    }

    public static void printBasicWithFp(List<String> list){
        list.stream().forEach(element -> System.out.println(element));
    }

    public static void printBasicWithFpFiltering(List<String> list){
        list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
    }
    public static void printBasicWithFpI(List<Integer> list){
        list.stream().forEach(element -> System.out.println(element));
    }
}
