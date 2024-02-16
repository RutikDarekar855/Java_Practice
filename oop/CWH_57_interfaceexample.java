package com.oop;
interface camera{
    void clickphoto();

    private void greet()
    {
        System.out.println("Good Morning Rutik");
    }
    void record();

    default void record4k()
    {
        greet();
        System.out.println("I am recording in 4k");
    }
}
interface wifi
{
    String [] network();
    void connect_to_network(String network);
}
class mycellphone{

    void callmethod(int phoneno)
    {
        System.out.println("Calling a method"+phoneno);
    }
    void pickcall()
    {
        System.out.println("Connecting");
    }


}
class smartphone1 extends mycellphone implements camera,wifi{
    public void clickphoto(){
        System.out.println("I am Clicking photo");
    }
    public void record(){
        System.out.println("I am recording");
    }
    public String [] network(){
        String[] network = {"Rutik","Karan","Pranav","Shivling"};
        return network;
    }
    public void connect_to_network(String network){
        System.out.println("Connecting to a network"+network);
    }
}

public class CWH_57_interfaceexample {
    public static void main(String[] args) {
        smartphone1 s = new smartphone1();
        String[] st = s.network();
        for (String element:st) {
            System.out.println(element);
        }
        s.clickphoto();
        s.record4k();
    }
}
