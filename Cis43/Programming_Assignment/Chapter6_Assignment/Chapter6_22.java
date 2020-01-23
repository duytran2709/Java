/**
 * Chapter6_22
 * (Temperature Conversions) Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
calculation
    celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
the calculation
    fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application 
that enables the user ei- ther to enter a Fahrenheit temperature 
and display the Celsius equivalent or to enter a Celsius temperature and display the Fahrenheit equivalent.
 */

import java.util.Scanner;
import java.lang.*;

public class Chapter6_22 {

    public static int celsius(int temperature) {
        double celsius = 5.0 / 9.0 * (temperature - 32);
        return (int) (celsius);
    }

    public static int fahrenheit(int temperature) {
        double fahrenheit = 9.0 / 5.0 * temperature + 32;
        return (int) (fahrenheit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1.  Fahrenheit to Celsius\n2.  Celsius to Fahrenheit\n3.  Exit\n");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            switch (choice) {
            case 1: {
                System.out.print("Enter Temperature: ");
                int temp = input.nextInt();
                System.out.printf("%d Fahrenheit is %d Celsius\n", temp, celsius(temp));
                break;
            }
            case 2: {
                System.out.print("Enter Temperature: ");
                int temp = input.nextInt();
                System.out.printf("%d Fahrenheit is %d Celsius\n", temp, fahrenheit(temp));
                break;
            }
            case 3:
                System.exit(0);
            default:
                continue;
            }

        }   
    }
    
}