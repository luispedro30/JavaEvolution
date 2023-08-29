package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student2Runner {

    public static void main(String[] args) {
        List<Student2> students = List.of(new Student2("Luis", 25),
                new Student2("Carlos", 24),new Student2("João", 23));

        ArrayList<Student2> ArrayListStudents = new ArrayList<>(students);

        System.out.println(ArrayListStudents);
        Collections.sort(ArrayListStudents);
        System.out.println(ArrayListStudents);

    }
}
