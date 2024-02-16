package com.company;
import java.util.Scanner;

public class CWH_15_Practice {
    public static void main(String[] args) {
       // System.out.println("Enter the String which need to be converted in lowercase");
      //  Scanner sc = new Scanner(System.in);
     //   String st1 = sc.nextLine();
        //System.out.println(st1.toLowerCase());

        // Problem to instead of spaces use underscore
        String st2 = "Rutik  Maruti Darekar";
        System.out.println(st2.replace(" ","_"));

        // problem 3
        String st3 = st2.replace("Rutik","Rutuja");
        System.out.println(st2.indexOf(" "));

        // problem 4
        String myletter = "Hello Rutik\n\thope you are fine";
        System.out.println(myletter);



    }
}
