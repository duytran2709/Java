
/**
 * Main
 * Write a class called Item that has a string field called name 
 * and a double field called price and an integer field called quantity. 
 * In main, create a bag of type Item and place several item objects in the bag. 
 * Then in main calculate the total price of items purchased.
 *  You may remove each item and add the price to a total variable in a loop. 
 * The loop should end when the bag is empty. 
 */

public class Main {

	public static void main(String[] args) {

		BagInterface<Items> b1 = new ArrayBag<>();
		double price = 0;
		Items apple = new Items("apple", 3.3, 2 );
		Items orrange = new Items("orrange", 4.5, 3 );
		Items banana = new Items("banana", 4.2, 6 );

		b1.add(apple);
		b1.add(orrange);
		b1.add(banana);

		while (!b1.isEmpty()) {

			Items temp = b1.remove();
			System.out.println(temp);
			price += temp.getPrice() * temp.getQuantity();
			
		}

		System.out.printf("Total price is %.2f\n" , price);
		
	}

}
