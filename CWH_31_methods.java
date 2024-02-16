package com.company;
/* A method is a function written inside the class.since java is a object Oriented language
   we need to write method in the same class
   note : Method always return Something
   note : if there is no static method then we need to create a object of it.
*/
public class CWH_31_methods {
    static int logic(int x, int y)
    {
        int z;
        if(x<y)
        {
             z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        // methods in java
        int a = 20;
        int b =40;

        // Method creation using object Creation
        // CWH_31_methods obj = new CWH_31_methods();
//        System.out.println(obj.logic(a,b));
//
//        CWH_31_methods obj1 = new CWH_31_methods();
//        System.out.println(obj1.logic(10,20));
        int c = logic(a,b);
        System.out.println(c);



    }
}
