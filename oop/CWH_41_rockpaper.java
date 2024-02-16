package com.oop;

import java.util.Random;
import java.util.Scanner;

public class CWH_41_rockpaper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper , 2 for scissor ");
        int Userinput = sc.nextInt();
        // Rock --> 0
        // Paper -->1
        // Scissor --> 2

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(Userinput == computerInput)
        {
            System.out.println("Match Drawn");

        }
        else if(Userinput == 0 && computerInput == 2 || Userinput ==1 && computerInput==0 || Userinput==2 && computerInput==1)
        {
            System.out.println("You Win");
        }
        else
        {
            System.out.println("Computer Win");
        }
        if (computerInput == 0)
        {
            System.out.println("Computer choice : Rock");
        }
        if(computerInput == 1)
        {
            System.out.println("Computer choice : Paper");
        }
        if (computerInput == 2)
        {
            System.out.println("Computer choice : Scissor");
        }






    }

}
