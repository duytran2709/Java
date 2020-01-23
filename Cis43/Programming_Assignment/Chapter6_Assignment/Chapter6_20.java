/**
 * Chapter6_20
 * (Circle Area) Write an application that prompts the user for the radius of a circle 
 * and uses a method called circleArea to calculate the area of the circle.
 */


//Ex 6.20

import java.util.Scanner;

public class Chapter6_20 {


    public static double circleArea ( int user_input)
    {
        double circleArea = Math.PI * Math.pow(user_input, 2); 
        return circleArea;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user_input = 0;
        while(true) {
        System.out.print("Enter the radius (negative to quit): ");
        user_input = input.nextInt();

        if (user_input < 0)
            break;
        System.out.printf("Area : %f",circleArea(user_input));
        System.out.println();
        }   
    } 
}