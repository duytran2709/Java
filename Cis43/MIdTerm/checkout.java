/**
 * Write a program checkout.java to calculate the total of items bought at an online store. 
 * Shipping charge is 7% of the total order. Store is offering free shipping with purchases of $75 or more. 
 * Assume no sales tax. 
 * Program will ask user to enter the item quantity and price for all the items (user enter -1 to indicate finished), 
 * then calculate and print the total number of items, total cost including shipping and average cost per item (including shipping).

Sample output:                

Enter Item 1 quantity (-1 to exit): 3

Enter item 1 price: 15

Enter item 2 quantity (-1 to exit): 1

Enter item 2 prices: 42.5

Enter item 3 quantity (-1 to exit): 1

Enter item 3 price: 9.99

Enter item 4 quantity (-1 to exit): -1

 

Total number of items: 5               Subtotal: $97.49               Shipping charge: free

Total: $97.49                                    Average cost per item:  $19.50
 */

import java.util.Scanner;


public class checkout {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int counter = 1;
        double total = 0;
        double subtotal = 0;
        int total_number_of_items = 0;
        double average = 0; 
        double shipping = 0;
         
        do {
            System.out.printf("Enter Item %d quantity (-1 to exit): ", counter);
            int number_of_items = input.nextInt();
            if (number_of_items < 0)
                break;
            else
                total_number_of_items += number_of_items;
            System.out.printf("Enter Item %d price: ", counter);
            double price = input.nextDouble();
            double price_of_item = number_of_items * price;
            subtotal += price_of_item;
            counter++;
        } while (true);

        
        
        System.out.printf("Total number of items: %d\n", total_number_of_items);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        if (subtotal < 75)
           {    shipping = subtotal * 0.07;
               total = subtotal + shipping;
            System.out.printf("Shipping charge: %.2f\n", shipping); }
        else
        {
            total = subtotal;
            System.out.printf("Shipping charge: %s\n", "free"); }
        System.out.printf("Total: %.2f\n", total);
        average = total / total_number_of_items;
        System.out.printf("Average cost per item: %.2f\n", average);

    }
    
}