import java.io.FileWriter;
import java.io.IOException;

public class Lab7 {
	//P1
	static int findMissing(int[] a)
	{
		int max = a[0];
		int min = a[0];
		int n = a.length;
		int total = 0;
		for (int index = 0; index < n; index++)
		{
			if (a[index] < min) min = a[index];
			else if (a[index] > max) max = a[index];
			total = total + a[index];
		}
		
		if (max != n+1) return n + 1;
		if (min != 1) return min;
		
		return ((n + 1) * ( n + 2))/2 - total;
	}
	//P2
	public static void countingSort(int[] a, int n)
	{
		int [] temp  = new int [n];
		int m = a.length;

		for (int index = 0; index < n; index++)
			temp[index] = 0;
		
		//Count
		for (int index = 0; index < m; index++)
			temp[a[index]-1]++;
		
		//Convert temp to a
		int i = 0;
		for (int index = 0; index < n; index++)
		{
			while (temp[index] > 0)
			{
				a[i] = index + 1;
				temp[index]--;
				i++;
			}
		}
	}
	
	//P3
	private static void sortFirstMiddleLast(int[] a, int first, int mid, int last)
	{
		order(a, first, mid);
		order(a, mid, last);
		order(a, first, mid);
	}
	private static void order(int[] a, int i, int j)
	{
		if (a[i] > (a[j]))
			swap(a, i, j);
	}
	private static void swap (int[] array, int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	private static int partition (int[] a, int first, int last)
	{
		int mid = (first + last)/2;
		sortFirstMiddleLast (a, first, mid, last);
		
		swap (a, mid, last - 1);
		int pivotIndex = last - 1;
		int pivot = a[pivotIndex];
		
		int indexFromLeft = first + 1;
		int indexFromRight = last - 2;
		
		boolean done = false;
		while(!done)
		{
			while (a[indexFromLeft] < pivot)
				indexFromLeft++;
			
			while (a[indexFromRight] > pivot)
				indexFromRight--;
			
			if (indexFromLeft < indexFromRight)
			{
				swap(a, indexFromLeft, indexFromRight);
				indexFromLeft++;
				indexFromRight--;
			}
			else
				done = true;
		}
		swap(a, pivotIndex, indexFromLeft);
		pivotIndex = indexFromLeft;
		return pivotIndex;
	}
	 
	public static int findSmallest(int[] a, int first, int last, int k)
	{
		int pivotIndex = partition (a, first, last);

		if (pivotIndex == k-1) return a[pivotIndex];
		if (pivotIndex >= k)
			return findSmallest(a, first, pivotIndex, k);
		else
			return findSmallest(a, pivotIndex, last, k);
	}
	
	public static int findMedian(int[] a)
	{
		int length = a.length;
		int first = 0;
		int last = length - 1;
		return findSmallest(a, first, last, length/2);
	}

	public static void main(String[] args) {
		int[] a = {9, 2, 4, 8, 9, 4, 3, 2, 8, 1, 2, 7, 2, 5};
		int[] missingArray = {4,7,5,2,6,1};
		try
		{
			FileWriter output = new FileWriter ("output.txt");
			if (output != null)
			{
				//P1
				output.write("Array [");
				for (int i = 0; i < missingArray.length; i++)
				{
					output.write(missingArray[i] + "");
					if (i < missingArray.length - 1)
						output.write(", ");
				}
				output.write("]\n-> Miss: " + findMissing(missingArray));
				
				
				//P2
				//Print array
				output.write ("\n\nOriginal Array: ");
				for (int i = 0; i < a.length; i++)
					output.write(a[i] + " ");
				
				//Sort
				int entryNum = 9;
				countingSort(a, entryNum);
				
				//Print sorted array
				output.write ("\n-> Sorted Array: ");
				for (int i = 0; i < a.length; i++)
					output.write(a[i] + " ");
				
				
				//P3
				output.write("\n->The median of the array is: " + findMedian(a));
				output.close();
			}
		}
		catch (IOException ieo)
		{
			ieo.printStackTrace();
		}
	}

}
