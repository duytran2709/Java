/**
 * Chapter8_6_SavingAccountTest
 */

import java.util.Scanner;

public class SavingAccountTest {
    public static void main(String[] args) {
        
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        

        System.out.println("Annual Interest Rate: 4%");
        SavingAccount.setAnnualInterestRate(0.04);
        System.out.printf("%-10s\t%12s\t%12s\n", " " , "Saver1", "Saver2");
        System.out.println(SavingAccount.toString("Base", saver1.getBalance(), saver2.getBalance()));
        

        for ( int i = 1; i <= 12; i++)
        {   
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println(SavingAccount.toString("Month"+i, saver1.getBalance(), saver2.getBalance()));
            
        }
        System.out.println("After setting interest rate to 5%");
        SavingAccount.setAnnualInterestRate(0.05);
        System.out.printf("%-10s\t%12s\t%12s\n", " " , "Saver1", "Saver2");
        System.out.println(SavingAccount.toString("Base", saver1.getBalance(), saver2.getBalance()));
        

        for ( int i = 1; i <= 12; i++)
        {   
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println(SavingAccount.toString("Month"+i, saver1.getBalance(), saver2.getBalance()));
        
        }
        
    }
    
}