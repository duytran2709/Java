
/**
 * Chapter5_12
 * (Calculating the Product of Odd Integers) 
 * Write an application that calculates the product of the odd integers from 1 to 15.
 */


public class Chapter5_12 {

    public static void main(String[] args) {

        int product = 1;
        for ( int counter = 1; counter <= 15; counter += 2)
        {
            product *= counter ;
        }

        System.out.printf("the odds' product: %d", product);
        
    }
}
