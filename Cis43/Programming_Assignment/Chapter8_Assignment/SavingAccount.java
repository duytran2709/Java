/**
 * Chapter8_6_SavingAccount
 * Create class SavingsAccount.
 *  Use a static variable annualInterestRate to store the annual interest rate for all account holders. 
 *  Each object of the class contains a private instance variable savingsBalance -
 * - indicating the amount the saver currently has on deposit. 
 * Provide method calculateMonthlyInterest to calculate the monthly interest - 
 * - by multiplying the savingsBalance by annualInterestRate divided by 12—this interest should be added to savingsBalance. 
 * Provide a static method modifyInterestRate that sets the annualInterestRate to a new value. 
 * Write a program to test class SavingsAccount. 
 * Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. 
 * Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months and print the new balances for both savers. 
 * Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.
 */


public class SavingAccount {
    private double balance = 0; 
    private static double annualInterestRate = 0;

    public SavingAccount (double balance)
    {
        this(balance,0);
    }

    public SavingAccount (double balance, double rate)
    {
        this.balance = balance;
        rate = annualInterestRate;
    }
    
    public double getBalance ()
    {
        return balance;
    }

    public void setBalance (double balance)
    {
        this.balance = balance;
    }

    public static double getAnnualInterestRate ()
    {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate (double interestRate)
    {
        annualInterestRate = interestRate;
    }

    public void calculateMonthlyInterest ()
    {
        balance += balance * (annualInterestRate / 12);
    }

    public static void modifyInteresrate(double newInterestRate ) {
        annualInterestRate = newInterestRate;
    } 

    public static String toString(String string, double acc1, double acc2)
    {
        return 
        String.format("%-10s\t%12.2f\t%12.2f", string , acc1, acc2 );

    }
}