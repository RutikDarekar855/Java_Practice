package com.oop;

// Introduction to Interface

interface Bicycle{
    int a = 44;
    void applybreak(int decrement);  // as  it is a interface all the methods should be implemented....
    void speedup(int increment);
}
interface blowhorn{
    void blowhorn();

}
class ranger implements Bicycle , blowhorn
{
    void horn()
    {
        System.out.println("Hornplease");
    }

    public void applybreak(int decrement){
        System.out.println("Applying Breaks");
    }
    public void speedup(int increment){
        System.out.println("Speed Up Rutik");
    }
    public void blowhorn()
    {
        {
            System.out.println("This is Blow Horn");
        }
    }
}
public class CWH_54_Interface {
    public static void main(String[] args) {
          ranger r = new ranger();
          r.applybreak(1);
        // you can create properties in Interface
        System.out.println(r.a);
        // you cannot modify the properties in the interface as they are final
        // r.a = 243; // this line will give you a error
        r.blowhorn();





    }
}
