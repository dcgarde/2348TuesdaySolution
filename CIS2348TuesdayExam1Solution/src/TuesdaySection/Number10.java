package TuesdaySection;
/**
 * This question asks students to complete the java code.
 * Below is the complete java code for determining if the user input
 * is an even or odd number.
 * */

import java.util.Scanner;

public class Number10 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        findEvenOdd(num);
    }

    /* this is the answer to the questions
     * use the findEvenOdd method to determine if the number entered
     * by the user is odd or even
     * prints "Number is even" if even
     * prints "Number is odd" if odd */
    public static void findEvenOdd(int num) {
        int remainder = num % 2; //use the modulus to get the remainder of the number

        /* Determine if remainder is 0 or 1 to be able to know if the number input is odd/even */
        if(remainder == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
