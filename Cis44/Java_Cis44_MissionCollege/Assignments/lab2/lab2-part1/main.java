/**
 * CIS 44 Lab-2 March-28 2020 at 11:59 PM Name: 1 Write a recursive method to
 * display a linked list1 in reverse order. 2 Write a recursive method that
 * accepts a number and finds the sum of all numbers from 1 to that number
 * recursively. In other words, if the input to the function is 5, the output
 * must be 5 + 4 + 3 + 2 + 1 + 0. Main must print the sum. 3 Write a recursive
 * method that accepts a number and finds the sum of all the numbers smaller
 * than that number and are even. Main must print the sum. 4 Write the Fibonacci
 * program to get the nth number in Fibonacci sequence recursively. 5 Write a
 * program to perform insertion sort. Test your code. 6 Write a program to
 * perform selection sort. Test your code.
 * 
 */
public class main {

    public static void main(String[] args) {

        LinkedStack<Integer> list1 = new LinkedStack<>();

        list1.push(1);
        list1.push(2);
        list1.push(3);
        list1.push(4);
        list1.push(5);

        list1.display();

        System.out.print("Display in reverse order: ");
        list1.reverseListRecursive();
        System.out.println();

        System.out.print("Sum of all integer from 1 to 5 is : ");
        System.out.println(list1.recurive_sum(5));

        System.out.print("Sum of all integers are smaller than 9 and are even: ");
        System.out.println(list1.recurive_sum_even(9));

        System.out.print("Fibonacci methods of number 8: ");
        System.out.println(list1.Fibonacci(8));

    }
}