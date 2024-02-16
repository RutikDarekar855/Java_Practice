package com.company;

public class CWH_29_issorted {
    public static void main(String[] args) {
        int [] array = {12,45,65,75,2};
        boolean issorted = false;
        for(int i=0 ; i<array.length-1;i++)
        {
            if(array[i]<array[i+1])
            {
                issorted = true;
                break;
            }
        }
        if(issorted == true)
        {
            System.out.println("array is  not Sorted");
        }
        else
        {
            System.out.println(" sorted");
        }
    }
}
