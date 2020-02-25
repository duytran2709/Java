import java.util.ArrayList;
import java.util.Collections;

public class Car_test1 {
    public static void main(String[] args) {

        ArrayList<Car> list = new ArrayList<Car>();
        
        Car car1;
        car1 = new Car();

        car1.setTank(5);
        car1.setSpeed(2);
        car1.setModel("Tesla");
        System.out.println(car1);

        car1.goSlow(5);
        System.out.println("The speed of car1 after going slower: " + car1.getSpeed() + " mph");

        car1.goFast(10);
        System.out.println("The speed of car1 after going faster: " + car1.getSpeed() + " mph");

        double cost = car1.pumpingGas(100);
        System.out.printf("The cost of pumped gas: $%.2f\n", cost);

        Car car2;
        car2 = new Car();
        car2.setTank(8);
        car2.setSpeed(10);
        car2.setModel("Honda");
        System.out.println(car2);

        Car car3;
        car3 = new Car();
        car3.setTank(14);
        car3.setSpeed(5);
        car3.setModel("Toyota");
        System.out.println(car3);

        list.add(car1);
        list.add(car2);
        list.add(car3);

        
        if ( car1.compareTo(car2) > 0)
            System.out.println("Car1 is going faster");
        else if (car1.compareTo(car2) < 0)
            System.out.println("Car2 is going faster");
        else 
        System.out.println("Car1 and Car2 are running at the same speed");
        
        System.out.println(list);
        Collections.sort(list);
        System.out.println("****After sorting all the cars: ");
        System.out.println(list);




    }
}