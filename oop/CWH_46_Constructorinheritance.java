package com.oop;

// When derived class is extented from base class the constructor of the base class is executed first.
// If we want to call the constructor with  parameter form the parent class.we can use super keyword..
class Base1 {
    public Base1() {
        System.out.println("I am a Base class Constructor");
    }

    public Base1(int a) {
        System.out.println("I am a overloaded Constructor :" + a);

    }
}
    class derived1 extends Base1 {
         derived1() {
             // If we want to run the constructor with argument then we use super keyword
             //super(20);
            System.out.println("I am a derived class constructor");
        }
        derived1(int a , int b)
        {
            super(a);
            System.out.println("I am a overloaded constructor of derived with value :"+a+ " "+b);
        }
    }
    class chidofderived extends derived1{
        public chidofderived() {
            System.out.println("This is constructor od childofderived");
        }

        public chidofderived(int a, int b,int c) {
            super(a, b);
            System.out.println("this is constructor overloaded of childofderived  : "+a+" "+b+" "+c);
        }
    }

    public class CWH_46_Constructorinheritance
    {
        public static void main(String[] args) {
//            derived1 d = new derived1();
//            derived1 d = new derived1(20,30,);
            chidofderived c1 = new chidofderived(20,30,40);
        }
    }

