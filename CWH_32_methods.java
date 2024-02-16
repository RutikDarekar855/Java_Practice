package com.company;

public class CWH_32_methods {

    static  void foo()
    {
        System.out.println("hello Rutik this is without parameter");
    }
    static void foo(int a) // these are parameters
    {
        System.out.println("this is with parameter"+a);
    }



    // If we do you method static we do not need to create our object
   static  void number1(int[]arr)
  {
      arr[0] = 100;
  }

    static void number(int a)
  {
      a = 98;

  }
   static void telljokes(){
        System.out.println("Hello this is a Joke");
    }
    public static void main(String[] args) {

       telljokes();
//        CWH_32_methods obj1 = new CWH_32_methods();
//        obj1.telljokes();

        // Changing the Integer
        int x =90;
        number(x);
        System.out.println(x);
        int [] array = {12,54,65,77,44,46};
        number1(array);
        System.out.println("Now we get the array[0] as "+array[0]);
// note : I case of array the reference is passed. same as object passing to the methods

     foo();
     foo(20);  // these are arguments i.e actual

        // Method overloading cannot be performed by changing the return type



    }
}
