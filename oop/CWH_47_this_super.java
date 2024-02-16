package com.oop;
class Rutik{
    int a;

    public Rutik(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int return_one(){
        return 1;
    }
}
class Darekar extends Rutik{

     Darekar(int c) {
        super(c);
         System.out.println("I am a Constructor");
    }
}


public class CWH_47_this_super {
    public static void main(String[] args) {
         Rutik r = new Rutik(22);
         Darekar d = new Darekar(23);
         System.out.println(r.getA());

    }
}
