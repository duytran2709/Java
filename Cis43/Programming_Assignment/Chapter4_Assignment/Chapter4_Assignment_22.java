
//Ex 4.22
import java.util.Scanner;

public class Chapter4_Assignment_22 {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");
        int number = 1;
        for (int counter= 1; counter <= 5; counter++)
        {
            int row = number;
            for (int counter2 = 1; counter2 <= 4; counter2++)
            {
                System.out.print(row);
                System.out.print("\t");
                row = row * 10;
            }
            number++;
            System.out.println();
        }

    }
}