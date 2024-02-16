package com.oop;
class practicethreads extends Thread{


    @Override
    public void run() {
       int i =0;
       while(i<7){
           System.out.println("Good Morning ");
           try {
               Thread.sleep(900);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           i++;
       }
    }
}
class thr extends Thread{

    @Override
    public void run() {
        int i =0;
        while(i<7){
            System.out.println("Good Night");
            i++;
        }
    }
}
public class CWH_76_Practice_threads {
    public static void main(String[] args) {
        practicethreads t1 = new practicethreads();
        t1.start();
        thr t3 = new thr();
        t3.start();
        t3.setPriority(10);
        System.out.println(t3.getPriority());
        System.out.println(Thread.currentThread().getState());

    }
}
