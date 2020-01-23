/**
 * Chapter5_24
 * (Diamond Printing Program) Write an application that prints the following diamond shape.
 * You may use output statements that print a single asterisk (*), a single space or a single new- line character.
 *  Maximize your use of repetition (with nested for statements), and minimize the number of output statements.
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

//Ex 5.24
public class Chapter5_24 {

    public static void main(String[] args) {

        for (int counter = 1 ; counter <= 5 ; counter++)
        {   
            for (int counter2 = 5 - counter; counter2 >= 0; counter2-- )
            {
                System.out.print(" ");
            }
            for (int counter3 = 1; counter3 < counter * 2; counter3++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int counter = 1 ; counter <= 4 ; counter++)
        {   
            for (int counter3 = counter - 1; counter3 < counter * 2; counter3++ )
            {
                System.out.print(" ");
            }
            for (int counter2 = 9 - (counter * 2) ; counter2 > 0; counter2 = counter2 - 1 )
            {
                System.out.print("*");
            }
           
            System.out.println();
        }
        
    }
}