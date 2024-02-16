package com.oop;
class mythr1 extends Thread{
    public mythr1(String name)
    {
        super(name);
    }
    public void run(){
     int i=0;
     while(i<7){

         System.out.println("Thank you"+this.getName());
         i++;
     }
}

}
public class CWH_74_thread_priorities {
    public static void main(String[] args) {

        mythr1 t1 = new mythr1("Rutik");
        mythr1 t2 = new mythr1("Rutik");
        mythr1 t3 = new mythr1("Rutik");
        mythr1 t4 = new mythr1("Rutik");
        mythr1 t5 = new mythr1("Rutik(Most Important)");

        t1.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t5.setPriority(Thread.MAX_PRIORITY);

    }
}
