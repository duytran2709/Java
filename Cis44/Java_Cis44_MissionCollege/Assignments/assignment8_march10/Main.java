/**
 * Main
 * 12-	Assume we already have the StackInterface code and the class StackArray code available. 
 * The goal of this program is to write the main code. 
 * This code should create two StackArray objects of type String.
 *  You should then place some fruit names in one stack and some fruit names in the other stack. 
 * After the names are placed in each stack,
 *  then your code should check if the two stacks have the same fruit names in the same order. 
 *  Note that after the check, the two stacks should have the same original values as before the check started.
 */
public class Main {

    public static void main(String[] args) {

        LinkedStack<String> fruitBag1 = new LinkedStack<>();
        LinkedStack<String> fruitBag2 = new LinkedStack<>();

        String fruit1 = new String("orrange");
        String fruit2 = new String("apple");
        String fruit3 = new String("banana");
        String fruit4 = new String("pipe_apple");
        String fruit5 = new String("water_melon");
        String fruit6 = new String("peach");

        fruitBag1.push(fruit1);
        fruitBag1.push(fruit2);
        fruitBag1.push(fruit4);
        fruitBag1.push(fruit3);
        fruitBag2.push(fruit4);
        fruitBag2.push(fruit5);
        fruitBag2.push(fruit3);

        LinkedStack<String> fruitTempBag1 = new LinkedStack<>();
        LinkedStack<String> fruitTempBag2 = new LinkedStack<>();

        int counter = 1;
        while (!fruitBag1.isEmpty() && !fruitBag2.isEmpty() )
        {
            String temp1 = new String("");
            String temp2 = new String("");

            temp1 = fruitBag1.pop(); 
            fruitTempBag1.push(temp1);
            System.out.print(temp1);
            System.out.print(" vs ");
            temp2 = fruitBag2.pop();
            fruitTempBag2.push(temp2);
            System.out.println(temp2);
            if (temp1.equals(temp2))
            {
                System.out.println("Item " + counter + " of two bags is the same");
            } 
            else
                System.out.println("Item " + counter + " of two bags is not the same");
            counter++;

        } 

        while (!fruitTempBag1.isEmpty())
        {
            String temp3 = fruitTempBag1.pop();
            fruitBag1.push(temp3);
        }

        while (!fruitTempBag2.isEmpty())
        {
            String temp4 = fruitTempBag2.pop();
            fruitBag2.push(temp4);
        }

        System.out.println("Items in fruitBag1: ");
        fruitBag1.display();
        System.out.println("Items in fruitBag2: ");
        fruitBag2.display();

        
    }

    
}