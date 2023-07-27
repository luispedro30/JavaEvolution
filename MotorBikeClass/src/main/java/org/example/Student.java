package org.example;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {

    private String name;
    private int[] marks;

    public Student (String nameInput, int[] marksInput){
        this.name = nameInput;
        this.marks  = marksInput;
    };

    public int getNumberOfMarks(){
        return this.marks.length;
    };

    public int getTotalSumOfMarks(){
        int sum = 0;
        for (int i = 0; i <= this.marks.length -1 ; i++){
            sum = sum + this.marks[i];
        }
        return sum;
    };

    public int getMaximumMarks(){
        int max = this.marks[0];
        for (int i = 0; i <= this.marks.length -1 ; i++){
            if (this.marks[i] > max){
                max = this.marks[i];
            }
        }
        return max;
    }

    public int getMinimumMarks(){
        int min = this.marks[0];
        for (int i = 0; i <= this.marks.length -1 ; i++){
            if (this.marks[i] < min){
                min = this.marks[i];
            }
        }
        return min;
    }

    public float getAverageMarks(){
        float sum = 0;
        float mean = 0;
        for (int i = 0; i <= this.marks.length -1 ; i++){
            sum = sum + this.marks[i];
        }
        mean = sum / this.marks.length;
        return mean;
    };


}
