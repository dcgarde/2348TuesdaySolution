package TuesdaySection;
/**
 * The question asks to write a java code that asks for 5 ages as an input,
 * determines the youngest age among the input, and if the youngest age is
 * eligible to vote.
 * */

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        /* Initialize variables */
        int voterAge;
        int ageInput;

        Scanner input = new Scanner(System.in);
        System.out.println("This program will print out the youngest age entered and determine if the person is eligible to vote.");
        System.out.println("This program can only accept a maximum of 5 ages.");
        System.out.print("Please enter 5 ages in this line followed by a space: ");
        voterAge = input.nextInt(); //assume legal voter's age is the first input

        /* Get more user input */
        for(int i = 0; i < 4; i++){
            ageInput = input.nextInt();
            if(ageInput < voterAge){
                voterAge = ageInput;
            }
        }

        /* Determine if youngest age entered is eligible to vote */
        if(voterAge == 18) //legal voter's age in USA is 18
            System.out.println("Youngest age is " + voterAge + " and they are eligible to vote.");
        else
            System.out.println("Youngest age is " + voterAge + ", but they are not eligible to vote.");
    }
}
