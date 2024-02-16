package com.oop;
import java.util.Random;
import java.util.Scanner;

class game{
      public int number;
      public int numberofguesses =0;
      public int takeuserinput;

    public int getNumberofguesses() {
        return numberofguesses;
    }

    public void setNumberofguesses(int numberofguesses) {
        this.numberofguesses = numberofguesses;
    }
      game()
      {
          Random rand = new Random();
          this.number = rand.nextInt(20);
          System.out.println("The Random number is "+number);
      }


      public void takeuserinput()
      {
          System.out.println("Enter the Guess number");
          Scanner sc = new Scanner(System.in);
          takeuserinput = sc.nextInt();

      }

      boolean iscorrect()
      {
          numberofguesses++;
          if(takeuserinput==number)
          {

              System.out.println("The number of guesses are "+numberofguesses);
              return true;
          }
          else if (takeuserinput<number){
              System.out.println("Number is less");
          }
          else if (takeuserinput>number){
              System.out.println("Number is large");
          }

          return false;
      }

}



public class CWH_43_exercise {



    public static void main(String[] args) {
        /*
        Create a Class game , which allow a user to play "Guess the number"
        Game once.Game should have following Methods
        1.Constructor to Generate a random number
        2.Takeuserinput() to take a user input of a number
        3.isCorrectNumber()to detect whether the number entered by the user is correct
        use properties as noofguesses(int),etc to get this task done
        4.Getters and setter for number of guesses

        */

        game g = new game();

        boolean b =false;
        while(!b){
            g.takeuserinput();
           b = g.iscorrect();
           System.out.println(b);
        }






    }
}
