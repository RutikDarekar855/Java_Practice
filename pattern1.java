package com.company;

public class pattern1 {
//    static int sumrec(int n)
//    {
//        if(n==1)
//        {
//            return 1;
//        }
//        return n + (n-1);
//    }
//
//    public static void main(String[] args) {
//
//
////        for( int i=1 ;i<=5 ; i++){
////            for(int j=1 ; j<=i ; j++)
////            {
////                System.out.print("*");
////            }
////            System.out.print("\n");
////        }
//        sumrec(4);
//    }
public static void main(String[] args) {
    int n = 6;
    for(int i=1 ; i<=n ;i++){
          for(int j=n ; j>i ; j--)
          {
              System.out.print("*");
          }
        System.out.print("\n");
    }
}


}
