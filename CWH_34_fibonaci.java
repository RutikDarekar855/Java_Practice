package com.company;

public class CWH_34_fibonaci {
    static int fibo(int n) {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }



    }
    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13
        int result = fibo(7);
        System.out.println(result);
        }

    }


