package com.company;

public class CWH_12_PRACTISE_SET {
    public static void main(String[] args) {

        char grade = 'B';
        grade = (char)(grade + 8); // Here I have done type casting i.e we force a variable to be in that shape
        System.out.println(grade);

        //   Decrypting the Grade
        grade = (char)(grade - 8);
        System.out.println(grade);



    }
}
