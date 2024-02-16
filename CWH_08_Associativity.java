package com.company;

// associativity in java
public class CWH_08_Associativity {
    public static void main(String[] args) {
        byte b  =10;
        int a = 30;
        float f = 33.5f;
        double d = 23d;
        float v = 55.5f + a ;
        System.out.println(v);

// Increment and Decrement Operator
        int i = 10;
        int j = 11;
        int l = i++;  // First l is assigned i then i is incremented
        int m = ++j; // First m is Incremented then j is assigned
        System.out.println(i++); // Here the Value will Remain constant
        System.out.println(i); // Here we will get the value of i as 11
        System.out.println(++i); // ++i here we will get the Value of i as 11 as before printing it is incrementmenting
        System.out.println(i++); // Here the Value will be 11

    }
}

