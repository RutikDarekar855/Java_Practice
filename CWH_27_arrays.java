package com.company;

public class CWH_27_arrays {
    // arrays are the collection of similar types of Data
    public static void main(String[] args) {
        int[] marks = {23, 44, 56, 44};
        String[] marks12 = {"Rutik", "Karan"};
        System.out.println(marks.length); // o/p = 4 it starts with 1
        System.out.println(marks12[0]);

        // Normal For LOOP
        //for(int i = 0; i < marks.length; i++){
          //  System.out.println(marks[i]);
        // Range based For Loop

        for (int Rutik: marks)
        {
            System.out.println(Rutik);
        }
    }
    }


