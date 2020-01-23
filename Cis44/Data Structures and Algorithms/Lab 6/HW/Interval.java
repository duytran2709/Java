package SearchSort;

public class Interval {
	int lower;
	int upper;
	
	public Interval ()
	{
		lower = -1;
		upper = -1;
		
	}
	public Interval (int lower, int upper)
	{
		this.lower = lower;
		this.upper = upper;
		
	}
	public int getLower ()
	{
		return lower;
	}
	public int getUpper ()
	{
		return upper;	
	}

}
