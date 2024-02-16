package com.oop;

// Constructor in Java

// A member function used to create object while initalize an object while creating it. Hence it is called Constructor

class Employee223{
    private int id;
    private String Name;

    // We can pass agruments while using constructor
    public Employee223(String s , int i){
        id = i;
        Name = s;

    }

    public void setname(String n)
    {
        Name = n;
    }

    public String getName()
    {
        return Name;
    }
    public int getid()
    {
        return id;
    }
    public void setid(int id1)
    {
        id = id1;
    }



}

public class CWH_42_constructor {
    public static void main(String[] args) {

        Employee223 rt = new Employee223("Parameter",444);
//        rt.setid(22222);
//        rt.setname("Rutikbhaiiii");
        System.out.println(rt.getid());
        System.out.println(rt.getName());

    }
}
