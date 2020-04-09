

/**
 * 13-	Assume we already have a BagArray class. 
 * The goal of this program is to write the main code. 
 * You must declare two BagArray objects of type Integer. 
 * Place some integer values in the first BagArray object and some of the numbers maybe duplicates.
 *  After the numbers placed in the first BagArray, 
 * transfer all the numbers from the first BagArray to the second BagArray without having any duplicates in the second BagArray. 
 * Note that after this transfer, the first BagArray should still have all the items placed in it originally.
 */
public class Main1 {

    public static void main(String[] args) {
        
        BagInterface<Integer> bag1 = new ArrayBag<>();
        BagInterface<Integer> bag2 = new ArrayBag<>();

        BagInterface<Integer> tempBag1 = new ArrayBag<>();
        
        bag1.add(1);
        bag1.add(5);
        bag1.add(8);
        bag1.add(9);
        
        bag2.add(10);
        bag2.add(11);
        bag2.add(8);
        bag2.add(5);

        System.out.println("bag2 before receiving numbers from bag1 : ");
        bag2.display();

        while (!bag1.isEmpty())
        {
            int temp = bag1.remove();
            tempBag1.add(temp);
            if(!bag2.contains(temp))
                bag2.add(temp);
        }
        System.out.println("bag2 after receiving numbers from bag1 : ");
        bag2.display();

        while (!tempBag1.isEmpty())
        {
            int temp = tempBag1.remove();
            bag1.add(temp);
        }

        System.out.println("Numbers in bag1: ");
        bag1.display();
        
    }
}