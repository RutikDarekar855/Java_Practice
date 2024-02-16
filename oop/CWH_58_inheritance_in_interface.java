package com.oop;

interface sampleinterface{
    void meth1();
    void meth2();
}
interface childinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class Mysampleclass implements childinterface{
    public void meth3(){
        System.out.println("THis is meth3");
    }
    public void meth4(){
        System.out.println("This is meth4");
    }
    public void meth1(){
        System.out.println("This is meth1");
    }
    public void meth2(){
        System.out.println("THis is meth2");
    }
}
public class CWH_58_inheritance_in_interface {
    public static void main(String[] args) {

        Mysampleclass m  = new Mysampleclass();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();

    }
}
