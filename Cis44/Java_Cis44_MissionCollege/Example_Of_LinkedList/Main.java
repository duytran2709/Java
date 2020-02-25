public class Main {

	public static void main(String[] args) {
		BagInterface<Integer> bInteger = new LinkedBag1<>();
		BagInterface<String> bString = new LinkedBag1<>();
		BagInterface<Car> bCar = new LinkedBag1<>();
		
		bInteger.add(15);
		bInteger.add(7);
		bInteger.add(9);
		
		bString.add("Hello");
		bString.add("Pen");
		bString.add("Apple");
		bString.add("Cat");
		
		Car car1 = new Car(10, 55);
		Car car2 = new Car(10, 5);
		Car car3 = new Car(10, 155);
		Car car4 = new Car(10, 50);
		Car car5 = new Car(10, 55);
		
		bCar.add(car1);
		bCar.add(car2);

		bCar.add(car3);

		bCar.add(car4);

		bCar.add(car5);

		
		System.out.println(bInteger.minimum());
		System.out.println(bString.minimum());
		System.out.println(bCar.minimum());
		
		bInteger.display();
		bString.display();
		bCar.display();
		
		
		System.out.println(bInteger);
		System.out.println(bString);
		System.out.println(bCar);

	}

}
