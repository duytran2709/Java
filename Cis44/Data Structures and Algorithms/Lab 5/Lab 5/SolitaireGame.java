package SolitaireGame;

import java.io.*;

import java.util.Random;

import java.util.Iterator;
import java.util.Random;
/**
   A solitaire matching game in which you have a list of random
   integer values between 10 and 99. You remove from the list any
   pair of consecutive integers whose first or second digits match.
   If all values are removed, you win.

 */
public class SolitaireGame
{

	/** Initializes the list with 40 random 2 digit numbers. */
	public static void initializeList(ArrayListWithIterator<Integer> theList)
	{
		int num = 0;
		Random randomNum = new Random();
		for (int i = 0; i < 40; i++)
		{
			do
			{
				num = randomNum.nextInt(100);
				if ((num >= 10) && (num <=99))
					theList.add(num);
			}
			while ((num < 10) || (num > 99));
		}
	
	} // end initializeList

	/** Sees whether two numbers are removable.
		@param x  The first 2 digit integer value.
		@param y  The second 2 digit integer value.
 		@return  True if x and y match in the first or second digit. */
	public static boolean removable(Integer x, Integer y)
	{
		if ((x < 10) || (x >99)) return false;
		if ((y < 10) || (y >99)) return false;
	
		while ((x > 0) && (y > 0))
		{
			if (x%10 == y%10)
			{
				return true;
			}
			x = x/10;
			y = y/10;
		}
		return false;
	
	} // end removable

	/** Display the contents of theList using an Iterator
	 * 
	 */
	public static void displayList(ArrayListWithIterator<Integer> theList) 
	{
		
		Iterator <Integer> iteratorList = theList.iterator();
		System.out.print("[");
		while (iteratorList.hasNext())
		{
			System.out.print (iteratorList.next());
			
			if (iteratorList.hasNext())
				System.out.print (", ");
		}
		System.out.println ("]");
		
	}
	/** Scans over the list and removes any pairs of values that are removable.
		@param theList  The list of 2 digit integers to scan over.
		@return  True if any pair of integers was removed. */
	public static boolean scanAndRemovePairs(ArrayListWithIterator<Integer> theList)
	{
		boolean found = false;
		int firstNum = -1;
		int secondNum = -1;
		
		Iterator <Integer> iteratorFirst = theList.iterator();
		Iterator <Integer> iteratorSecond = theList.iterator();
		
		if (iteratorSecond.hasNext())
		{
			secondNum = iteratorSecond.next();
		} else return found;
		
		do
		{
			if (iteratorFirst.hasNext())
			{
				firstNum = iteratorFirst.next();
			} else break;
			
			if (iteratorSecond.hasNext())
			{
				secondNum = iteratorSecond.next();
			} else break;
			
			if (removable (firstNum, secondNum))
			{
				//Printing removed items
				
				System.out.println("Removed: " + firstNum + ", " + secondNum);
				
				found = true;
				iteratorSecond.remove();
				iteratorFirst.remove();
			}
			
		} while (iteratorFirst.hasNext());
		
		return found;
		
	} // end scanAndRemovePairs

	public static void main(String args[])
	{
		boolean found = true;
		ArrayListWithIterator <Integer> list = new ArrayListWithIterator<Integer>();
		initializeList(list);
		
		try
		{
			PrintStream output = new PrintStream(new File ("output.txt"));
			if (output!= null)
			{
				System.setOut(output);
				System.out.println ("The list is originally: ");
				displayList(list);
				
				do
				{
					found = scanAndRemovePairs(list);
					if (found)
					{
						System.out.print("\nThe list is now: ");
						displayList(list);
					}
				} while (found);
				
				if (list.isEmpty()) System.out.println ("-> The list is empty!");
				else  System.out.println ("-> No more pairs can be removed");
				
				output.close();
			}
		}
		catch (IOException eio)
	    {
	    	eio.printStackTrace();
	    }
		
		
	} // end main
} // end SolitaireGame

/*
Example outupt
The list is originally: [81, 50, 11, 61, 42, 74, 16, 65, 49, 49, 11, 19, 67, 79, 33, 95, 85, 52, 59, 67, 46, 81, 62, 30, 60, 66, 80, 96, 30, 81, 37, 30, 34, 30, 15, 80, 11, 61, 55, 46]
   Removed: 11  61
   Removed: 49  49
   Removed: 11  19
   Removed: 95  85
   Removed: 52  59
   Removed: 30  60
   Removed: 37  30
   Removed: 34  30
   Removed: 11  61
The list is now: [81, 50, 42, 74, 16, 65, 67, 79, 33, 67, 46, 81, 62, 66, 80, 96, 30, 81, 15, 80, 55, 46]
   Removed: 65  67
   Removed: 62  66
The list is now: [81, 50, 42, 74, 16, 79, 33, 67, 46, 81, 80, 96, 30, 81, 15, 80, 55, 46]
   Removed: 81  80
The list is now: [81, 50, 42, 74, 16, 79, 33, 67, 46, 96, 30, 81, 15, 80, 55, 46]
   Removed: 46  96
The list is now: [81, 50, 42, 74, 16, 79, 33, 67, 30, 81, 15, 80, 55, 46]
No more pairs to remove.

 */
