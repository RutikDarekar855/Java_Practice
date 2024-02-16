package com.company;

public class CWH_29_maxelement {
    public static void main(String[] args) {
        int[] array ={12,44,655,45,65};
        int max=0 ;
        for(int element : array)
        {
            if(element>max)
            {
                max = element;
            }
        }
        System.out.println(max);
    }
}
