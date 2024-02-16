package com.oop;
class NegativeRadiusException extends Throwable {

    public String tostring(){
        return "Radius cannot be Negative";
    }

    public String getmessage()
    {
         return "Radius cannot be Negative";
    }

}
public class CWH_throw_throws {
    static public double area(int r) throws NegativeRadiusException
    {
        if(r<0)
        {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    static public int divide(int a , int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {

    try
    {
//        int c =  divide(6,0);
//        System.out.println(c);
        double ar = area(5);
        System.out.println(ar);
    }
    catch (Exception e)
    {
        System.out.println("Exception");
    } catch (NegativeRadiusException e) {
        throw new RuntimeException(e);
    }


    }
}
