package SearchSort;
import java.util.* ;
public class Lab6
{
	// Problem 1
	public static <T extends Comparable<? super T>> 
	       boolean inArrayIterativeSorted(T[] anArray, T anEntry) {
		
		boolean found = true;
		int first = 0;
		int last = anArray.length;
		int mid = 0;
		while ((first < last) && !found)
		{
			mid = first + (last-first)/2;
			if (anEntry.equals(anArray[mid]))
				found = true;	
			else if (anEntry.compareTo(anArray[mid]) == -1)
				last = mid;
			else
				first = mid +1;
		}
		return found;
	}
	
	// Problem 2
	public static <T extends Comparable<? super T>>
		Interval findInterval(T[] sortedData, List<T> targetValues){
		T min;
		T max;
		int targetLength = targetValues.size();
		min = targetValues.get(0);
		max = targetValues.get(0);
		
		int upper = -2;
		int lower = -2;
		
		T temp;
		int dataLength = sortedData.length;
		int first = 0;
		int last = sortedData.length - 1;
		int mid = first + (last - first)/2;
		
		boolean found = false;
		//Finding max and min in targetValues
		for (int index = 0; index < targetLength; index++)
		{
			if (min.compareTo(targetValues.get(index)) == 1)
			{
				min = targetValues.get(index);
			}
			else if (max.compareTo(targetValues.get(index)) == -1)
			{
				max = targetValues.get(index);
			}
		}
		
		//find range of min
		temp = sortedData[0];
		if (min.compareTo(temp) <= 0)
		{
			lower = -1;
		}
		else
		{
			first = 0;
			last = dataLength - 1;
			mid = first + (last - first)/2;
			temp = sortedData[mid];
			while (first < mid) 
			{
				if (min.compareTo(temp) < 0)
				{
					last = mid;
					
				}
				else if (min.compareTo(temp) > 0)
				{
					first = mid;
				}
				else
				{
					while (min.compareTo(sortedData[mid]) == 0)
					{
						mid--;
						if ((min.compareTo(sortedData[mid]) == 0) || (mid == 0))
						{
							lower = mid;
							break;
						}
					}
					break;
				}
				mid = first + (last - first)/2;
				lower = mid;
				if (mid == last) break;
			}
				
		}
		
		//find range of max
		temp = sortedData[dataLength-1];
		if (max.compareTo(temp) >= 0)
		{
			upper = dataLength;
		}
		else
		{
			first = 0;
			last = dataLength-1;
			mid = first + (last - first)/2;
			temp = sortedData[mid];
			while (mid < last)
			{
				if (max.compareTo(temp) > 0)
				{
					first = mid;
					
				}
				else if (max.compareTo(temp) < 0)
				{
					last = mid;
				}
				else
				{
					while (max.compareTo(sortedData[mid]) == 0)
					{
						mid++;
						
						if ((max.compareTo(sortedData[mid]) == 0) || (mid == dataLength))
						{
							upper = mid;
							break;
						}
					}
					break;
				}
				
				mid = first + (last - first)/2;
				upper = mid;
				if (mid == first) break;
			}
			
		}
		
		
		//Find upper
		
		
		Interval result = new Interval (lower, upper);
		return result;
	}

		

	
	// Problem 3
	public static <T extends Comparable<? super T>> boolean  isSorted(T[ ] a) {
		
		long length = a.length;
		for (int index = 0; index < length - 1; index++)
		{
			if (a[index].compareTo(a[index+1]) > 0)
			return false;
		}
		return true;
	}
	
	// Problem 4
    public static <T extends Comparable<? super T>> void modifiedSelectionSort(T[] a, int n) {
    	int indexFirst = 0;
    	int indexLast = n-1;
    	T min = a[indexFirst];
    	T max = a[indexLast];
    	int indexMin = indexFirst;
    	int indexMax = indexLast;
    	T temp = a[indexFirst];
    	
    	while (indexFirst < indexLast)
    	{
    		min = a[indexFirst];
    		max = a[indexLast];
    		
     		for (int i = indexFirst; i <= indexLast; i++)
    		{
    			if (a[i].compareTo(min) == -1)
    			{
    				min = a[i];
    				indexMin = i;
    			}
    			else if (a[i].compareTo(max) == 1)
    			{
    				max = a[i];	
    				indexMax = i;
    			}
    		}
    		
    		temp  = a[indexFirst];
    		a[indexFirst] = a[indexMin];
    		a[indexMin] = temp;
    		
    		if (max.equals(a[indexMin]))
    		{
    			indexMax = indexMin;
    			max = a[indexMax];
    		}
    		
    		temp = a[indexLast];
    		a[indexLast] = a[indexMax];
    		a[indexMax] = temp;

    		
    		indexFirst++;
    		indexLast--;
    		
    	}
    	
	
    } 
      
} 
