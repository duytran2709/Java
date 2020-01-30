/**
 * Car
 */
public class Car {

    private int speed;
    private int tank;
    private String model;

    Car ()
    {
        this.speed = 0;
        this.tank = 0;
        this.model = "new car";
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

    public String toString()
    {
        String st ="";
        st = st + "The model of this car is " + this.model + "\n"; 
        st = st + "Speed is = " + this.speed + " This car has " + this.tank + " gallons";
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

    public void goFast (int speed)
    {
        this.speed += speed;
    }

    public void goSlow ()
    {
        if (this.speed >= 5)
            this.speed -= 5;
        else this.speed = 0; 
    }
}