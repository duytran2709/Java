import java.util.ArrayList;

public class Car_test1 {
    public static void main(String[] args) {
        
        Car car1;
        car1 = new Car();

        car1.setTank(5);
        car1.setSpeed(2);
        car1.setModel("Tesla");

        System.out.println(car1);

        car1.goSlow();
        System.out.println("The speed after going slower: " + car1.getSpeed() + " mph");

        car1.goFast(10);
        System.out.println("The speed after going faster: " + car1.getSpeed() + " mph");

        double cost = car1.pumpingGas(100);
        System.out.println(car1);
        System.out.println("The cost of pumped gas: " + cost);



    }
}