/**
 * RectangleTest
 */

import java.util.Scanner;
public class RectangleTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        do {
            System.out.println("1/ Set Length \n2/ Set Width \n3/ Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            if (choice == 3){
                break;
            }
            if (choice == 1) {
                System.out.print("Enter Length: ");
                float length = input.nextFloat();
                rectangle.setLength(length); }
            if (choice == 2) {
                System.out.print("Enter Width: ");
                float width = input.nextFloat();
                rectangle.setWidth(width); }
            System.out.println(rectangle);
        } while(true);
    }
}
