package com.oop;

import java.util.Scanner;

public class CWH_81_Specific_exception {

    // Handing Specific Exception in Java
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 12;
        marks[1] = 23;
        marks[2] = 24;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index Number");
        int idx =  sc.nextInt();

        System.out.println("Enter the Number that you want to divide");
        int number = sc.nextInt();

        try {
            System.out.println("Enter the Array Index number "+marks[idx]);
            System.out.println("The Number after Dividing is "+marks[idx]/number);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurs");
        }
        catch (Exception e){
            System.out.println("Öther Exception Occued");
        }

    }
}
