package com.oop;

class Employee2{
    int salary;
    String Name;

    public int getSalary()
    {
        return salary;
    }

    public String getname(){
           return Name;
    }
    public void setname(String n)
    {
        Name=n;

    }

}

class cellphone
{
    public void ringing()
    {
        System.out.println("Phone is Ringing");
    }

    public void vibrating()
    {
        System.out.println("THe Phone is Vibrating");
    }
}

class square{
    int side;

    public int side()
    {
        return side*side;
    }

    public int perimeter()
    {
        return 4*side;
    }
}


public class CWH_39_oopspractice {

    public static void main(String[] args) {

        Employee2 obj = new Employee2();

        obj.setname("Rutik you are the best");
        System.out.println(obj.getname());

        obj.salary= 12000000;
        System.out.println(obj.getSalary());

        cellphone cell = new cellphone();
        cell.ringing();
        cell.vibrating();


        square sq = new square();
        sq.side = 3;

        System.out.println(sq.side());
        System.out.println(sq.perimeter());

    }
}
