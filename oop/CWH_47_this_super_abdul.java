package com.oop;

class Rectangle1{
    int length;
    int breadth;
    int x =10;

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void display()
    {
        System.out.println("this is a length"+length);
        System.out.println("this is a breadth"+breadth);
    }
}
class cuboid extends Rectangle1{
    int height ;
    int x = 20;

    cuboid(int l , int b , int h)
    {
        super(l,b);
        height = h;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class CWH_47_this_super_abdul {
    public static void main(String[] args) {

//        Rectangle1 a = new Rectangle1(12,33);
//        a.display();

        cuboid c = new cuboid(12,43,44);
        c.display();


    }
}
