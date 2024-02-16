package com.company;
import java.util.Scanner;
public class CWH_23_forloop {
    public static void main(String[] args) {
        System.out.println("Enter the n natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n ; i>=0 ;i--)
        {
            System.out.println(i);
        }
    }
}
