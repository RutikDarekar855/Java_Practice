package com.oop;


class Circle{
       public void meth1()
       {
           System.out.println("This is Circle");
       }
}
class cylinder extends Circle{

    public void meth2()
    {
        System.out.println("This is Cylinder");
    }
}
public class CWH_52_inheritancepracticeset {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.meth1();

        cylinder c1 = new cylinder();
        c1.meth2();







    }
}
