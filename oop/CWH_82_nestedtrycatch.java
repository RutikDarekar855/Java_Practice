package com.oop;

import java.util.Scanner;

public class CWH_82_nestedtrycatch {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 20;
        marks[1] = 60;
        marks[2] = 30;
        marks[3] = 70;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ënter the Index");
        int ind = sc.nextInt();
        try{
            System.out.println("Hello this is Vedio number 82");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this Index does not exits");
                System.out.println(e);
                System.out.println("Rutik here we are inside the nested try&catch");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Here we are outside of Nested try & catch");
        }

    }
}
