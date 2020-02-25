
/**
 * Assignment5 - Cis44 Spring 2020
 * 
 * Create a bag of String called refrigerator that contains 2 pizzas, 2 red apples, 2 oranges, 1 ice-cream.  
 * Create another bag called itemsNeeded of type String. 
 *  Add 4 pizzas, 2 chips, and 1 ice-cream to this bag. 
 * Your program must create a String bag containing list of items to be purchased called mustPurchase. 
 * This bag should contain only the things that we are missing in the refrigerator.
 *  Display the three bags. 
 */

public class Main {

	public static void main(String[] args) {

		BagInterface<String> refrigerator = new ArrayBag<>();
		
		String pizza = new String("pizza"); 
		String red_apples = new String("red_apple");
		String oranges = new String("orange");
		String ice_cream = new String("ice_cream");
		String chip = new String("chip");

		refrigerator.add(pizza);
		refrigerator.add(pizza);
		refrigerator.add(red_apples);
		refrigerator.add(red_apples);
		refrigerator.add(oranges);
		refrigerator.add(oranges);
		refrigerator.add(ice_cream);
		

		System.out.println("Items in refrigerator: ");
		refrigerator.display();

		BagInterface<String> itemsNeeded = new ArrayBag<>(); 

		for (int i = 0; i < 4; i++)
		{
			itemsNeeded.add(pizza);
		}

		itemsNeeded.add(chip);
		itemsNeeded.add(chip);
		itemsNeeded.add(ice_cream);

		System.out.println("Items needed list: ");
		itemsNeeded.display();
		
		BagInterface<String> mustPurchase = new ArrayBag<>();

		int size = itemsNeeded.getCurrentSize();
		
		for ( int i = 1; i <= size; i++)
		{
			
			String temp = new String(itemsNeeded.remove());
			if( !refrigerator.contains(temp))
			mustPurchase.add(temp);
			else
			{
				if(refrigerator.getFrequencyOf(temp) <= itemsNeeded.getFrequencyOf(temp))
				{
					mustPurchase.add(temp);
				}
			}
		}

		System.out.println("Must purchased-item list: ");
		mustPurchase.display();
	}

}
