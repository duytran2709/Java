package SearchSort;
import java.util.* ;

import java.io.IOException;
import java.io.FileWriter;
public class SortArray
{
    public static <T extends Comparable<? super T>> void selectionSort(T[] a, int n) {
	for (int index = 0; index < n - 1; index++)
	    {
		int indexOfSmallest = indexOfSmallest(a, index, n - 1);
		T temp = a[index];
		a[index] = a[indexOfSmallest];
		a[indexOfSmallest] = temp; 
		//Invariant: a[0] <= a[1] <= . . . <= a[index] <= all other a[i]
	    } // end for
    } // end selectionSort
    
    private static <T extends Comparable<? super T>>
			      int indexOfSmallest(T[] a, int first, int last) {
	T min = a[first];
	int indexOfMin = first;
	for (int index = first + 1; index <= last; index++)
	    {
		if (a[index].compareTo(min) < 0)
		    {
			min = a[index];
			indexOfMin = index;
         } 
	    } 
	return indexOfMin;
    } 

    public static <T extends Comparable<? super T>>
			     void insertionSort(T[] a, int n) {
	for(int unsorted = 1; unsorted < n; ++unsorted) {
	    T item = a[unsorted];
	    int loc = unsorted;
	    while(loc > 0 && a[loc-1].compareTo(item) > 0) {
		a[loc] = a[loc-1];
		--loc;
	    }
	    a[loc] = item;
	}	
    }

    public static <T extends Comparable<? super T>>
			     void bubbleSort(T[] a, int n) {
	
	for(int pass = 1; pass < n ; ++pass) {
	    for(int index = 0; index < n-pass; ++index) {
		int nextIndex = index + 1;
		if(a[index].compareTo(a[nextIndex]) > 0) {
		    T temp = a[index];
		    a[index] = a[nextIndex];
		    a[nextIndex] = temp;
		}
	    }
	}	 
    }

    public static <T extends Comparable<? super T>>
			     void bubbleSort2(T[] a, int n) {
	boolean sorted = false;
	for(int pass = 1; pass < n && !sorted ; ++pass) {
	    sorted = true;
	    for(int index = 0; index < n-pass; ++index) {
		int nextIndex = index + 1;
		if(a[index].compareTo(a[nextIndex]) > 0) {
		    T temp = a[index];
		    a[index] = a[nextIndex];
		    a[nextIndex] = temp;
		    sorted = false;
		}
	    }
	}	 
    }
    
    public static void main(String [] args) {
    Integer [] a = { 15, 1, 8 , 10 , 2, 5 };
	
	System.out.println("a = " + Arrays.toString(a));
	List <Integer> list = new ArrayList<Integer>();
	list.add(8);
	list.add(7);
	list.add(2);
	list.add(9);
	list.add(15);
	System.out.println (list);
	
	
	try
	{
		FileWriter output = new FileWriter ("output.txt");
		if (output != null)
		{
			output.write("a = " + Arrays.toString(a));
			output.write ("\nIs sorted: " + Lab6.isSorted(a));
			
			//Sort a
			Lab6.modifiedSelectionSort(a, a.length);
			output.write("\n\nAfter sorted:");
			output.write("\na = " + Arrays.toString(a));
			
			//Test binary search
			Integer testSearch = 8;
			output.write("\nIs " + testSearch + " in the array: " + Lab6.inArrayIterativeSorted(a, testSearch));
			
			//Create list
			output.write ("\n\nList is: ");
			output.write (list.toString());
			//Get range
			Interval test = Lab6.findInterval(a , list);
			output.write("\nRange: [" + test.getLower() + "," + test.getUpper() + "]");
			output.close();
		}
	}
	catch (IOException ieo)
	{
		ieo.printStackTrace();
	}

	//Interval test = Lab6.findInterval(a , list);
	Lab6.findInterval(a , list);
	//System.out.println (test.getLower());

	
    }
    
} // end SortArray
