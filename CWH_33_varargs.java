package com.company;

public class CWH_33_varargs {

//    static int sum(int a , int b)
//    {
//        return a+b;
//    }
//    static int sum(int a , int b,int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a , int b,int c,int d)
//    {
//        return a+b+c+d;
//    }
    static int sum(int ...arr){
        // avaiable as int [] arr;
        int result=0;
        for(int ele : arr)
        {
            result += ele;     // 1 ,2,3
        }
        return result;

    }



    public static void main(String[] args) {

        System.out.println("The sum of a and b is "+sum(20,30));
        System.out.println("The sum of a and b is "+sum(20,30,10));
        System.out.println("The sum of a and b is "+sum(20,30,10,20));

    }
}
