package com.oop;
class mythr2 extends Thread{
    public mythr2(String name)
    {
        super(name);
    }
    public void run(){
        int i=0;
        while(i<7){

            System.out.println("Thank you"+this.getName());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

}

class mynewthread extends Thread
{
    public void run(){
        int i=0;
        while(i<7){

            System.out.println("Myyyy......Thank you"+this.getName());
            i++;
        }
    }
}
public class CWH_75_ThreadMethodsinjava {
    public static void main(String[] args) {
        mythr2 t1 = new mythr2(" Hello Rutik");
        mynewthread t2 = new mynewthread();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
