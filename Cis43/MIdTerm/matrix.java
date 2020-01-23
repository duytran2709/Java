/**
 * Write a program matrix.java that performs the following,

Define a method called printStarMatrix which takes two parameters, number of rows (m) and columns(n), 
then print a m by n matrix of stars.
Define a method called printBorder which takes 3 parameters, number of rows (m) and columns(n), 
and a border character (ch) then print a m by n matrix bordered with the character.
Take user input of number of rows, columns and border character, 
call printStarMatrix and printBorder methods to print the matrix. See sample output.
Sample output:

Enter number of rows: 3

Enter number of columns: 6

Enter Border character: x

Star Matrix:

*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
Matrix with Border
x  x  x  x  x  x
x                     x
x  x  x  x  x   x
 */

import java.util.Scanner;

public class matrix {

    public static void printStarMatrix (int rows, int columns) {
        for (int m = 1; m <= rows; m++)
        {
            for (int n = 1; n <= columns; n++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printBorder(int rows, int colums, String character) {
        for (int m = 1; m <= rows; m++)
        {   for (int n = 1; n <= colums; n++)
                if (m == 1 || m == rows )
                    System.out.print(character + " ");
                else if (( n == 1 || n == colums))
                    System.out.print(character + " ");
                else 
                    System.out.print("  ");
            System.out.println();

        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        System.out.print("Enter Border Character: ");
        String character = input.next();


        printStarMatrix(rows, columns);
        System.out.println("Matrix with Border");
        printBorder(rows, columns, character);
    }
}