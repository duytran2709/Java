/**
 * Chapter5_16
 * (Bar Chart Printing Program) 
 * One interesting application of computers is to display graphs and bar charts. 
 * Write an application that reads five numbers between 1 and 30. 
 * For each number that’s read, your program should display the same number of adjacent asterisks. 
 * For exam- ple, if your program reads the number 7, it should display *******. 
 * Display the bars of asterisks after you read all five numbers.
 */

 //Ex 5.16

import java.util.Scanner;

public class Chapter5_16 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your number1: ");
    int number1 = input.nextInt();

    System.out.println("Please enter your number2: ");
    int number2 = input.nextInt();

    System.out.println("Please enter your number3: ");
    int number3 = input.nextInt();

    System.out.println("Please enter your number4: ");
    int number4 = input.nextInt();

    System.out.println("Please enter your number5: ");
    int number5 = input.nextInt();

    for (int counter = 1; counter <= 5; counter++)
    {
        int counter2 = 0;
        switch (counter) {
            case 1: counter2 = number1;
                break;
            case 2: counter2 = number2;
                break;
            case 3: counter2 = number3;
                break;
            case 4: counter2 = number4;
                break;
            case 5: counter2 = number5;
            default:
                break;
        }
        for (int counter3 = 1; counter3 <= counter2; counter3++ )
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}