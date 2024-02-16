package com.company;

public class CWH_34_recursion {
    static int fact_iterative(int n)
{
    int product = 1;
    for (int i=1 ; i<=n ; i++)
    {
        product *= i;
    }
    return product;

}
    public static void main(String[] args) {
        // recursion in java
        // A function in java which call itself such calling of Function is called recursion
        // Factorial(0) == 1
        //factorial(n) = n*n-1*n-3*.....1;
        //factorial(n) = n*factorial(n-1);
        int x = 5;
        System.out.println("The Factorial of Given Number is "+fact_iterative(x));




    }
}
/*
fact(5)
= 5 * fact(4)
= 5 * 4 * fact(3)
= 5 * 4 * 3 * fact(2)
= 5 * 4 * 3 * 2 * fact(1)
= 5 * 4 * 3 * 2 * 1 * fact(0)
= 5 * 4 * 3 * 2 * 1 * 1  (base case reached, fact(0) and fact(1) are both 1)
= 120

 */