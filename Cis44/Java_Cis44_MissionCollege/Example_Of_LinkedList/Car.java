public class Car implements Comparable<Car>{
	private int tank;
	private int speed;
	private static int count;
	public Car()
	{

		this(0);
	}
	
	public Car(int t)
	{

		tank = t;
		speed = 0;
		count++;
	}
	
	public Car(int t, int s)
	{
		
		tank = t;
		speed = s;
		count++;
	}
	
	public int compareTo(Car c)
	{
		if (speed > c.speed )
			return 1;
		else if (speed == c.speed)
			return 0;
		else
			return -1;
	}
	public int getTank()
	{
		return tank;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int s)
	{
		
	}
	
	public void setTank(int t)
	{
		if (t > 20)
		tank = 20;
	}
	
	
	
	public double pumpGas(int g)
	{
		int gallons;
		if (g + tank > 20) 
			gallons = 20 - tank;
		else
			gallons = g;
			
		
		tank = tank + gallons;
		
		double amount = gallons * 4.4;
		return amount;
	}
	
	
	
	public void goFast()
	{
		speed += 5;
		tank--;
	}
	
	@Override
	public String toString()
	{
		String str="";
		str = str+"tank has " + tank + "speed is " + speed;
		return str;
	}
	
	@Override
	public boolean equals(Object c)
	{
		Car car = (Car)c;
		if (speed == car.speed && tank == car.tank)
		    return true;
		else
			return false;
	}
	
	
	public static int getCount()
	{
		return count;
	}
	

}
