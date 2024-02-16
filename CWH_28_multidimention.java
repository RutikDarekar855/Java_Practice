package com.company;

public class CWH_28_multidimention {
    public static void main(String[] args) {
        //this is also a way we can represent the syntax of array
        // int[][] flats = new int[2][3]; // syntax of array
        int[][]flats;
        flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 200;
        flats[0][2] = 300;
        flats[1][0] = 400;
        flats[1][1] = 500;
        flats[1][2] = 600;
        System.out.println("Printing the 2D arrays");
        for(int i=0 ;i< flats.length ; i++)
        {
            for(int j =0 ;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
