package com.company;
import java.util.Scanner;

public class CWH_05_takinginput {
    public static void main(String[] args){
        System.out.println("Enter the two Numbers");
        Scanner sc = new Scanner(System.in); //
        System.out.println("Enter the Number 1");
        int a = sc.nextInt();
        System.out.println("Enter the number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        System.out.println("Enter the String");
        String str = sc.next(); // next() --> It only Prints the Single String example : rutik
        System.out.println(str);
        System.out.println("Enter the String2");
        String str2 = sc.nextLine(); // nextLine() --> It Prints the Entire String example : rutik Maruti Darekar
        System.out.println(str2);
        System.out.println();
    }

}



