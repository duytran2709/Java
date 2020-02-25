import java.util.ArrayList;

public class Car_test1 {
    public static void main(String[] args) {
        
        Car car1;
        car1 = new Car();

        car1.setTank(5);
        car1.setSpeed(2);
        car1.setModel("Tesla");

        System.out.println(car1);

        car1.goSlow(5);
        System.out.println("The speed after going slower: " + car1.getSpeed() + " mph");

        car1.goFast(10);
        System.out.println("The speed after going faster: " + car1.getSpeed() + " mph");

        System.out.println("--------------------------------------------");
        System.out.println("Pump 100 galons of gas to the car");
        double cost = car1.pumpingGas(100);
        System.out.printf("The cost of pumped gas: $%.2f \n", cost);
        System.out.println("--------------------------------------------");


        System.out.println(car1);



    }
}