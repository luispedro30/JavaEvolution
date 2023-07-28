package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student (String nameInput, int[] marksInput){
        this.name = nameInput;
        for (int mark:marksInput){
            this.marks.add(mark);
        }
    };

    public int getNumberOfMarks(){
        return this.marks.size();
    };

    public int getTotalSumOfMarks(){
        int sum = 0;
        for (int mark: this.marks){
            sum = sum + mark;
        }
        return sum;
    };

    public int getMaximumMarks(){
        int max = 0;
        for (int mark: this.marks){
            if (mark > max){
                max = mark;
            }
        }
        return max;
    }

    public int getMinimumMarks(){
        int min = this.marks.get(0);
        for (int mark: this.marks){
            if (mark < min){
                min = mark;
            }
        }
        return min;
    }

    public float getAverageMarks(){
        float sum = 0;
        float mean = 0;
        for (int mark: this.marks){
            sum = sum + mark;
        }
        mean = sum / this.marks.size();
        return mean;
    };


}
