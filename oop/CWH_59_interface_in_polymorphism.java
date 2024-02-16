package com.oop;
interface camera1{
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
interface wifi1
{
    String [] network();
    void connect_to_network(String network);
}
class mycellphone1{

    void callmethod(int phoneno)
    {
        System.out.println("Calling a method"+phoneno);
    }
    void pickcall()
    {
        System.out.println("Connecting");
    }


}
class smartphone2 extends mycellphone implements camera1,wifi1{
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

public class CWH_59_interface_in_polymorphism {
    public static void main(String[] args) {
        camera1 s1 = new smartphone2();
        s1.clickphoto();

        smartphone2 s = new smartphone2();
        String[] ss = s.network();
        for (String ele: ss) {
            System.out.println(ele);
        }
    }
}
