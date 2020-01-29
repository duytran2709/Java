/**
 * Duy Tran - G01826554
 * Cis44 - Spring 2020
 * Car_test
 */

import java.util.Scanner;

public class Car_test {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double cost = 0;
        Car car1 = new Car(10, 8, "Tesla");
        System.out.printf("Your current speed: %d mph\n", car1.getSpeed());
        System.out.printf("Your current tank: %d galons\n", car1.getTank());
        System.out.printf("Your car model: %s\n", car1.getModel());

        System.out.println("How many galons of gas you want to pump in ?");
        int galons = input.nextInt();
        cost = car1.pumpingGas(galons);
        System.out.printf("Cost of your pumped gas: $%.2f \n",cost);

        System.out.println("How many MPH of speed do you want to increase?"); 
        int speed = input.nextInt();
        car1.goFast(speed);
        System.out.printf("Your current speed: %d mph\n", car1.getSpeed());
        
        car1.goSlow();
        System.out.printf("Your speed after slowing down 5mph: %d mph\n", car1.getSpeed());


    }
}