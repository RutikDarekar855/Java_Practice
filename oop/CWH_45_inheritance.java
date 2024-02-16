package com.oop;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {

        System.out.println("Ï am setting the Base class now ");
        this.x = x;
    }

    public void printme()
    {
        System.out.println("hello I am a constructor");
    }
}
class derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class CWH_45_inheritance {
    public static void main(String[] args) {
        // Inheritance in Java : Java does not support inheritance i.e two class two classes cannot be superclasses for a subclass

        // Creating a object of Base class
        Base b = new Base();
        b.setX(20);
        System.out.println(b.getX());

        // Creating a object of Derived class
        derived d = new derived();
        d.setX(20);
        System.out.println(d.getX());
    }
}
