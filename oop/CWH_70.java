package com.oop;

class mythread1 extends Thread{

    public void run(){
        int i=0;
        while(i<=20)
        {
            System.out.println("My thread is running ");
            i++;
        }
    }



}
class mythread2 extends Thread{
      public void run() {
          int i = 0;
          while (i <= 20) {
              System.out.println("My thread is running ");
              i++;
          }
      }
}
public class CWH_70 {
    public static void main(String[] args) {
          mythread1 t1 = new mythread1();

          mythread2 t2 = new mythread2();
          t1.start();
          t2.start();
    }
}
