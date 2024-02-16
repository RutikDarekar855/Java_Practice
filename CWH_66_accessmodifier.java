package com.company;

// Access Modifier : Access Modifer Defines whether other class can use particular field or invoke a particular method
// It can be public, Private , Protected
class c1{

public int x =90;
protected int y =900;
private int a = 22;
int z =334;

public void meth1()
{
    System.out.println(x);
}
}
class c2 extends c1{



}
public class CWH_66_accessmodifier {
    public static void main(String[] args) {
         c1 c = new c1();
         c.meth1();
         c2 c1 = new c2();

        System.out.println(c.y);
    }
}
