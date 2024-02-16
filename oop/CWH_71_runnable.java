package com.oop;

class Mythreadrunnable1 implements Runnable
{
    @Override
    public void run() {
        System.out.println("I am a thread not a thread");
        System.out.println("I am a thread not a thread");
        System.out.println("I am a thread not a thread");
        System.out.println("I am a thread not a thread");
        System.out.println("I am a thread not a thread");
        System.out.println("I am a thread not a thread");
        System.out.println("I am a thread not a thread");
        System.out.println("I am a thread not a thread");
    }


}
class Mythreadrunnable2 implements Runnable
{
    @Override
    public void run() {
        System.out.println("I am a thread2 not a thread2");
        System.out.println("I am a thread2 not a thread2");
        System.out.println("I am a thread2 not a thread2");
        System.out.println("I am a thread2 not a thread2");
        System.out.println("I am a thread2 not a thread2");
        System.out.println("I am a thread2 not a thread2");
        System.out.println("I am a thread2 not a thread2");
        System.out.println("I am a thread2 not a thread2");
    }


}
public class CWH_71_runnable {
    public static void main(String[] args) {
        Mythreadrunnable1 bullet1 = new Mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);
        Mythreadrunnable2 bullet2 = new Mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
