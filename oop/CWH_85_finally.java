package com.oop;

public class CWH_85_finally {
    public static int Greet() {
        try {
            int a = 100;
            int b = 50;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("THis is the End of the Function");
        }

        return 0;
    }

    public static void main(String[] args) {
        Greet();
        int a = 7;
        int b = 9;

            while(true)
            {
               try{
                   System.out.println(a/b);
               }
               catch (Exception e)
               {
                   System.out.println(e);
                   break;
               }
               finally {
                   System.out.println("I am Finally Block"+b);
               }
               b--;
            }
    }
}
