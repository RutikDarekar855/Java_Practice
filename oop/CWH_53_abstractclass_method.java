package com.oop;

abstract class parent2{
     parent2()
    {
        System.out.println("I am constructor of Basee");
    }
    public void Basee2()
    {
        System.out.println("Hello Rutik");
    }
    abstract public void greet();
    abstract public void greet2();

}

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Hello Rutik Darekar");
    }
    public void greet2()
    {
        System.out.println("Good Morning Rutik Bhai ");
    }
}
abstract class child3 extends parent2{
    public void th()
    {
        System.out.println("th");
    }
}
public class CWH_53_abstractclass_method {
    public static void main(String[] args) {

       // parent2 p = new parent2(); // We cannot create object of abstract class
        child2 c = new child2();


    }
}
