/* 
4.20 (Salary Calculator)
 Develop a Java application that determines the gross pay for each of three employees. 
 The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours worked in excess of 40. 
 You’re given a list of the employees, their number of hours worked last week and their hourly rates. 
 Your program should input this informa- tion for each employee, 
 then determine and display the employee’s gross pay. 
 Use class Scanner to input the data. */


 //Ex 4.20
import java.util.Scanner;

public class Chapter4_Assignment_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer counter = 1;
        while (counter <= 3)
        {
            System.out.print("Enter hourly rate: ");
            Integer hourlypay = input.nextInt();
            System.out.print("Enter hours worked: ");
            Integer workedHour = input.nextInt();
            
            if (workedHour <= 40)
               { double grossPay = workedHour * hourlypay;
                System.out.printf("Pay for Employee %d is: %.2f", counter, grossPay); 
                System.out.println(); }
            else {                
                double grossPay = (40 * hourlypay) + (workedHour - 40)*(hourlypay* 1.50);
                System.out.printf("Pay for Employee %d is: %.2f", counter, grossPay);
                System.out.println();
             }
             counter++;


        }

    }
}
