package com.company;

public class CWH_35_practice_set_on_methods {

//    static void multiplication(int n)
//    {
//        for (int i=1 ; i<=n ; i++){
//            System.out.println("multiplication of "+n+"*"+i+"="+(n*i));
//        }
//    }
//    public static void main(String[] args) {
//      multiplication(5);
//    }
    /*

    *           i=0 j=0
    * *         i=1 j=0 j=1
    * * *       i=2 j=0 j=1 j=2
    * * * *     i=3 j=0 j=1 j=2 j=3

    */
//{
//    for (int i=0 ; i<=n ; i++)
//        for (int j=0 ; j<=i ; j++)
//        {
//            System.out.print("*");
//        }
//    System.out.print("\n");





public static void main(String[] args) {
    for(int i=1 ; i<=5 ; i++){
        for(int j=1 ; j<=i ; j++)
        {
            System.out.print("* ");
        }
        System.out.print("\n");
    }


}

}

