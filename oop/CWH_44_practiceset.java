package com.oop;

class Cylinder{
    private int radius;
    private int height;



    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfacearea()
    {
        return 2*3.14*radius*radius + 2*3.14*radius*height;
    }
    public double volume()
    {
        return 3.14*radius*radius*height;
    }


}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle()
    {
        this.length = 2;
        this.breadth = 22;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class CWH_44_practiceset {
    public static void main(String[] args) {


        // Problem1
        Cylinder c = new Cylinder(9,12);
        c.setHeight(12);
        System.out.println(c.getHeight());
        c.setRadius(9);
        System.out.println(c.getRadius());

        // Problem 2
        System.out.println(c.surfacearea());
        System.out.println(c.volume());

        Rectangle r = new Rectangle(112,222);

        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


    }
}
