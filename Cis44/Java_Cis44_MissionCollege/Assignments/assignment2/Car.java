/**
 * Car
 * 1-	Modify the class Car you wrote in class Assignment-1 
 * to implement CarInterface and Comparable.
 *  The Car class must have a toString as well. 
 * Define an Arraylist of Cars in the main program 
 * and add several cars going at different speeds. 
 * sort them using Collections sort. 
 */
public class Car implements Carinterface , Comparable<Car> {

    private int speed;
    private int tank;
    private String model;
    private int num;
    private static int number = 0;

    Car ()
    {
        ++number;
        this.speed = 0;
        this.tank = 0;
        this.model = "new car";
        num = number; 
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getSpeed ()
    {
        return speed;
    }

    public void setTank (int tank)
    {
        if ((this.tank + tank ) > 15) this.tank = 15;
        else this.tank = this.tank + tank;
    }

    public int getTank()
    {
        return tank;
    }

    public void setModel( String model)
    {
        this.model = model;
    }

    public String getModel ()
    {
        return model; 
    }

    @Override
    public String toString()
    {
        String st ="------------------------------\n";
        st = st + "This is car number: " + num + "\n"; 
        st = st + "The model of this car is " + this.model + "\n"; 
        st = st + "Speed is = " + this.speed + " This car has " + this.tank + " gallons\n";
        st = st + "-----------------------------------------\n";
        return st;
    }

    public double pumpingGas ( int amountOfGas)
    {   
        double price = 3.14;
        if (tank == 15)
            return 0.0;
        else if ((tank + amountOfGas) <= 15) {
            this.tank += amountOfGas;
            return price * amountOfGas;
        } else {
            amountOfGas = 15 - tank;
            tank = 15;
            return price * amountOfGas;
        }
    }

    public void goFast (int s)
    {
        if((speed + s) > 100) speed = 100;
        else speed = speed + s;
    }

    public void goSlow (int s)
    {
        if((speed - s) < 0 ) speed = 0;
        else speed = speed - s;
    }

    public int compareTo(Car c)
    {
        if ( speed > c.speed) return 1;
        if (speed < c.speed) return -1;
        return 0;
    }

}