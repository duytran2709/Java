
/**
 * Write a program Numbers.java that performs the following:
Randomly generate 30 numbers from 2 to 9 and save them in an array. Print out all the numbers.
Calculate the total and the average of these numbers.
Find out how many numbers are above average.
Print out the occurrences of numbers as shown.
Sample output:

Generated numbers are : [7 4 4 7 7 5 4 3 8 7 4 6 2 6 3 9 9 8 3 5 5 2 4 4 8 6 5 7 2 5  ]
Total: 159             Average: 5.00
How many numbers above average: 13

Numbers                   Occurrences

2                                            3

3                                            3

4                                            6

5                                            5

6                                            3

7                                            5

8                                            3

9                                            2
 */

import java.security.SecureRandom;

public class Numbers {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        double total = 0;
        double average = 0;
        int[] numbers = new int[30];
        int above_average_numbers = 0;

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = 2 + random.nextInt(8);

        System.out.print("Generated numbers are: ");
        for (int i : numbers) {
            System.out.printf("%d ", i);
            total += i;
        }
        System.out.println();

        average = total / 30;
        System.out.printf("Total: %.0f\n", total);
        System.out.printf("Average: %.2f\n", average);

        for (int i : numbers) {
            if (i > average)
                above_average_numbers++;
        }

        System.out.printf("How many numbers above average: %d\n", above_average_numbers);

        int[] frequency = new int[8];
        for (int i = 0; i < frequency.length; i++ )
            frequency[i] = 0;

        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
            case 2: {
                ++frequency[0];
                break;
            }
            case 3: {
                ++frequency[1];

                break;
            }
            case 4: {
                ++frequency[2];

                break;
            }
            case 5: {
                ++frequency[3];

                break;
            }
            case 6: {
                ++frequency[4];

                break;
            }
            case 7: {
                ++frequency[5];

                break;
            }
            case 8: {
                ++frequency[6];

                break;
            }
            case 9: {
                ++frequency[7];

                break;
            }
            }
        }
        
        System.out.println("number\t\tOccurence");
        for (int i = 0; i < frequency.length; i++)
            System.out.printf("%d\t\t%d\n", i + 2, frequency[i]);
        
    }
}