package structure;

/**
 * checkoutTest
 */

import java.util.ArrayList; 
import java.util.Scanner;

public class CheckoutTest {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        Library[] lib = new Library[10];

        lib[0] = new Library(1234, "Book_1");
        lib[1] = new Library(2134, "Book_2");
        lib[3] = new Library (2143, "Book_3");
        lib[4] = new Library (1243, "Book_4");

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your studentID: ");
        int stuID = input.nextInt();

        ArrayList <Integer> ID = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter ID of book You want to borrow: ");
            int id = input.nextInt();
            if (id == -1)
                break;
            else
                ID.add(id);
        }


        Student[] stu = new Student[10];

        stu[0] = new Student(stuID, name, ID);



        
    }
    
}