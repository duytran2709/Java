
/**
 * Chapter6_25
 * (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example, 2, 3, 5 and 7 are prime, 
 * but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
a) Write a method that determines whether a number is prime.
b) Use this method in an application that determines 
and displays all the prime numbers less than 10,000. 
How many numbers up to 10,000 do you have to test to ensure that you’ve found all the primes?
 */

import java.util.Random;

public class Chapter6_25 {

    public static boolean definePrimeNumber(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Prime number between 2-100 are : ");
        int counter = 1;
        for (int number = 2; number < 100; number++) {
            
            if (definePrimeNumber(number) == true) {
                System.out.print(number + "\t");
                if (counter % 5 == 0)
                    System.out.println();
                counter++;
            }
        }

    }

}