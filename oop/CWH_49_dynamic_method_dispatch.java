package com.oop;

class phone{

    public void swagat()
    {
        System.out.println("Your Welcome Rutik");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class smartphone extends phone{
    public void greek(){
        System.out.println("this is Geek");
    }
    @Override
    public void name(){
        System.out.println("My name is Java in class two");
    }
}
public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        phone obj = new phone();
//        obj.name();
        phone obj = new smartphone();
        obj.name();
//        obj.greek();  you cannot call methods of sub methods . ONLY SUPERCLASS METHOD CAN BE CALLED



    }
}
