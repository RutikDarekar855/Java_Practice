package com.oop;

class  Employee{
    int id;
    String name;
    int salary;
    public void printdetails()
    {
        System.out.println("Rutik id is "+id);
        System.out.println("My name is "+name);
    }
    public int getsalary()
    {

        return salary;
    }
}
public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("Here we have Created our Custom Class");
        Employee obj = new Employee(); //Instantiating a new Employee Object
        Employee john = new Employee();
        // Setting Attribute for Rutik
        obj.id =21;
        obj.name = "Rutik Maruti Darekar";

        // setting Attritubes for john
        john.id = 100;
        john.name = "John Cena";
        john.salary = 30000;


        //Printing the Attributes
        System.out.println(obj.id);
        System.out.println(obj.name);

        // printing harray and john details
        obj.printdetails();
        john.printdetails();

        int salary = john.getsalary();
        System.out.println(salary);
    }
}
