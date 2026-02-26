/**
 * Write the pseudocode for an algorithm that takes 3 numbers
 * from the user and then calculates the average
 * Display the average only
 */

import java.util.Scanner;

public class M3HW2_Omojola
{
    public static void main(String[] args)
    {
        // variables
        double num1, num2, num3, average;

        // declare the keyboard variable to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // input
        System.out.print("Enter number one:");
        num1 = keyboard.nextDouble();

        System.out.print("Enter number two:");
        num2 = keyboard.nextDouble();

        System.out.print("Enter number three:");
        num3 = keyboard.nextDouble();

        // calculations
        average = (num1 + num2 + num3) / 3;

        // output
        System.out.println("The average is " + average);

        keyboard.close();
    }
}
