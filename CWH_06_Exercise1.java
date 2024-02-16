package com.company;
import java.util.Scanner;

public class CWH_06_Exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter your Marks of the Subject");
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        double sum = m1+m2+m3+m4+m5;
        double percentage = (sum/500)*100;
        System.out.println(percentage);


    }
}
