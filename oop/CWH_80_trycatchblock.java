package com.oop;
// Various Types of Exception in JAVA
// Null Pointer Exception
// Arithmetic Exception
public class CWH_80_trycatchblock {
    public static void main(String[] args) {
                int a = 400;
                int b;
                try{
                    int c = a/0;
                    System.out.println("This is Null Pointer Exception in java "+c);
                }
                catch (Exception e)
                {
                    System.out.println("Unable to Divide");
                    System.out.println(e);
                }

    }
}
