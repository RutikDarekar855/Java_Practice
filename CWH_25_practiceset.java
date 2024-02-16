package com.company;

public class CWH_25_practiceset {
    public static void main(String[] args) {
//        int n = 4;
//        for(int i=n ; i>0 ; i--)
//        {
//            for (int j=n ; j>=i ; j--)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//    }

//
// 5*4*3*2*1

//   int n =5;
//   int i =1;
//   int fact =1 ;
//   while (i<=n)
//   {
//
//        fact = fact*i;
//        i++;
//   }
//        System.out.println(fact);
//    }

        int n=5;
        int fact =1;
        for(int i=1 ;i<=n ; i++)
        {
            // 5*4*3*2*1
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
