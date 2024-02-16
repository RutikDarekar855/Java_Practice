package com.oop;
// Thread Constructor in JAVA

class mythr extends Thread{
    public mythr(String name)
    {
        super(name);
    }
    public void run(){
        int i=0 ;
        while(i<10)
        {
            System.out.println("Hello Rutik");
            i++;
        }

    }
}
public class CWH_73_threadconstructor {
    public static void main(String[] args) {
          mythr t1 = new mythr("Rutik");
          mythr t2 = new mythr("Krishna");
          t1.start();
          t2.start();
          System.out.println("The Id of thread is "+t1.getId());
          System.out.println("The Id of thread is "+t1.getName());
          System.out.println("The Id of thread is "+t2.getId());
          System.out.println("The Id of thread is "+t2.getName());
    }
}
