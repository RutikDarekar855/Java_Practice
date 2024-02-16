package com.company;

public class CWH_29_practicejava {
    public static void main(String[] args) {
        /*
        float [] array = {12.4f,54.3f,65.5f,99.5f};
        float sum =0;
        float sum1 =0;
        for(int i=0 ;i<array.length;i++)
        {
            sum1 = sum1+array[i];

        }
        System.out.println(sum1);
        for(float rutik:array)
        {
            sum = sum + rutik;
        }
        System.out.println(sum);
        */

//

        // Problem multidimentional array
        int [][] matx1 = {{1,2,3},
                          {3,4,5}}; // Here there are 2 rows and 3 coloum and matx1 length is 2
        int [][] matx2 = {{7,8,9},
                          {2,4,5}}; // Here there are 2 rows and 3 coloum and matx2 length is 2
        int [][] result = {{0,0,0},{0,0,0}};

        for(int i=0 ; i<2;i++){  // here matx1 length = 2
            for(int j=0 ; j<3; j++) // here matx1[i].length is 3
            {
                result[i][j]= matx1[i][j]+matx2[i][j];
                System.out.print(result[i][j]+" ");

            }
            System.out.println(""); // Prints a new line
        }





    }
}
