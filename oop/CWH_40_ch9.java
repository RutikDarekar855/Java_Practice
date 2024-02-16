package com.oop;

// access modifier in Java
// Specifies where a property method is accessable
/*
There are four types of access modifers
1. Private
2. public
3. protected
4. Default
*/
class Employee23{
   private int id;
   private String Name;

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
public class CWH_40_ch9 {

    public static void main(String[] args) {
        Employee23 rutik = new Employee23();
//        rutik.id = 33;
//        rutik.Name = "Rutik Darekar";

        rutik.setname("RutikDarekar");
        System.out.println(rutik.getName());

        rutik.setid(290);
        System.out.println(rutik.getid());




    }
}
