/* (Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user. */

//EX 5_11

import java.util.Scanner;

public class Chapter5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of integers: ");
        int numbers = input.nextInt();
        
        System.out.print("Please enter integer: ");
        int min = input.nextInt();
        for (int counter = 0; counter < numbers -1 ; counter++ )
        {
            System.out.print("Please enter integer: ");
            int integer = input.nextInt();
            if (integer < min)
                min = integer;
            else
                continue;
        }

        System.out.printf("The smallest integers: %d", min);

    }
}