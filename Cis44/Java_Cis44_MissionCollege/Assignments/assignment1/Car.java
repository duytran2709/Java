/**
 * Car
 */
public class Car {

    private int speed;
    private int tank;
    private String model;

    Car (int speed, int tank , String model)
    {
        this.speed = speed;
        this.tank = tank;
        this.model = model;
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
        this.tank = tank;
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

    public double pumpingGas ( int amountOfGas)
    {   double price = 3.14; 
        if (tank == 15)
        return 0.0;
        else if ( (tank + amountOfGas) <= 15)
            return price * amountOfGas;
        else return price * (15 - tank);
    }

    public void goFast (int speed)
    {
        this.speed += speed;
    }

    public void goSlow ()
    {
        if (this.speed != 0)
            this.speed -= 5;
    }
}