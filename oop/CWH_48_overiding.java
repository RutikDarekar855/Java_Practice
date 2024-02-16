package com.oop;

class A
{
    public int rutik()
    {
        return 44;
    }
    public void meth2()
    {
        System.out.println("This is method 2 of class A");
    }

}
class B extends A{
    @Override
    public void meth2()
    {
        System.out.println("This is method 2 of class B");
    }
    public void meth3()
    {
        System.out.println("This is method 3 of class B");
    }
}
public class CWH_48_overiding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B a1 = new B();
        a1.meth2();




    }
}
