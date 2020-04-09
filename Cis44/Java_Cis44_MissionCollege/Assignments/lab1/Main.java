
/**
 * Lab1 
 */

public class Main {

	public static void main(String[] args) {
		ArrayBag<String> b1 = new ArrayBag<>();
		ArrayBag<String> b2 = new ArrayBag<>();
		
		b1.add("Apple");
		b1.add("Orange");
		b1.add("Milk");
		b1.add("Milk");
		b1.add("Water");
		
		b2.add("Orange");
		b2.add("ice");
		b2.add("Milk");
		System.out.println("THIS IS B1");
		System.out.println(b1);
		System.out.println("___________________");	
		
		System.out.println("THIS IS B2");
		System.out.println(b2);
		System.out.println("___________________");
		
	
		
		
		ArrayBag<String> b4 = b1.union(b2);
		
		System.out.println("THIS IS Union OF B1 B2");
		System.out.println(b4);
		System.out.println("___________________");

		ArrayBag<String> b5 = b1.difference(b2);
		
		System.out.println("THIS IS Difference OF B1 B2");
		System.out.println(b5);
		System.out.println("___________________");

		ArrayBag<String> b3 = b1.intersection(b2);
		
		System.out.println("THIS IS Intersection OF B1 B2");
		System.out.println(b3);
		System.out.println("___________________");


	}

}


