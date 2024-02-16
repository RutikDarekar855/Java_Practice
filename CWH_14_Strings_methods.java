package com.company;

import java.sql.SQLOutput;
import java.util.Locale;

public class CWH_14_Strings_methods {
    public static void main(String[] args) {
        // We can Create these types of String
      String a = "Rutik";
      String a1 = new String("Hello Rutik");
      String nontrimstring = "         nottrim";
      System.out.println(a);
      System.out.println(a1);

      int value = a1.length();// returns the length of string
       //String lowercase = a.toLowerCase(); // return the string to lowercase
       //System.out.println(lowercase);

      // String uppercase = a.toUpperCase();
      // System.out.println(uppercase);
      // System.out.println(value);

       //System.out.println(nontrimstring);
       //System.out.println(nontrimstring.trim());

        //System.out.println(a.substring(2));
       // System.out.println(a.replace('R','O'));
        //System.out.println(a.replace("R","Rutik"));

        //System.out.println(a.startsWith("R"));
        //System.out.println(a.charAt(0));

        String ModifiedName = "Rutuja";
      //  System.out.println(ModifiedName.indexOf("tik",4));
        System.out.println(ModifiedName.lastIndexOf("u",6));
//        System.out.println(ModifiedName.lastIndexOf("k",1));
        System.out.println(ModifiedName.equals("Rutuja"));
        System.out.println(ModifiedName.equalsIgnoreCase("rUtuJa"));

        System.out.println("Hello I am \"Rutik\"Darekar");
    }
}
