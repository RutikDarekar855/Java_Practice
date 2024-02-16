package com.oop;


interface tvremote{
       void tv();
}
interface smarttvremote extends tvremote{
    @Override
    void tv();
}
interface Basicanimal{
    void eat();
    void sleep();
}
class monkey{
    public void jump()
    {
        System.out.println("Monkey");
    }
    public void bite()
    {
        System.out.println("bite");
    }
}
class Human extends monkey implements Basicanimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void speak()
    {
        System.out.println("speaking ");
    }
}

abstract class Pen{

    abstract void write();
    abstract  void refill();
}
class fountainpen extends Pen{
   public void write(){
       System.out.println("Writing");
    }
    public void refill(){
        System.out.println("refill");
    }
    public void changenib()
    {
        System.out.println("Changenib");
    }
}
public class CWH_60_practiceset {
    public static void main(String[] args) {

//        Human h =new Human();
//        h.speak();

        monkey m1 = new Human();
        m1.bite();
    }
}
