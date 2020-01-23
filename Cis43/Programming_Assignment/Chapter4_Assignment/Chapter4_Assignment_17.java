/* (Gas Mileage) Drivers are concerned with the mileage their automobiles get. 
One driver has kept track of several trips by recording the miles driven and gallons used for each tankful. 
Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. 
The program should calculate and display the miles per gallon obtained for each trip -
- and print the combined miles per gallon obtained for all trips up to this point. 
All averaging calculations should produce floating-point results.
 Use class Scanner and sentinel-controlled repetition to obtain the data from the user. */

import java.util.Scanner;


public class Chapter4_Assignment_17 {
    public static void main(String[] args) {
        Integer count = 1;
        float total_miles = 0.0F;
        float total_galons = 0.0F;
        while (true) {
            Scanner input = new Scanner(System.in);
            Integer mileage = 0;
            Integer usedGallons = 0;
            System.out.printf("Please enter the miles in trip %d (-1 to quit):  ", count);
            mileage = input.nextInt();
            if (mileage == -1)
                break;
            else {
            System.out.printf("Please input the gallons used in trip %d: ", count);
            usedGallons = input.nextInt();
            float averaging = mileage / usedGallons;
            System.out.printf("The averaging ( mileage per gallons) for the trip %d: %.2f", count, averaging);
            total_miles = total_miles + mileage;
            total_galons = total_galons + usedGallons;
            float total_miles_per_gallon = total_miles / total_galons; 
            System.out.println();
            System.out.printf("The total miles per gallon obtained for all trips up to this point: %.2f",
                    total_miles_per_gallon);
            System.out.println();
            count++; }

        }
    }
}