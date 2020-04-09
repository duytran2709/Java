

/**
 * main
 * 5	Write a program to perform insertion sort. Test your code.
6	Write a program to perform selection sort. Test your code.
 */

import java.util.Arrays;
public class main {

    public static <T extends Comparable<T>> void insertionSort(T[] a, int n)
    {
        for (int current = 1; current < n ; current ++)
        {
            T item = a[current]; 
            int location = current; 
            while( location > 0 && a[location-1].compareTo(item) > 0)
            {
                a[location] = a[location-1];
                location--;
            }
            a[location] = item;

        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] a, int n)
    {
        for (int i = 0 ; i < n-1; i++)
        {
            int iMin = i;
            for (int j = i + 1; j < n ; j++)
            {
                if(a[j].compareTo(a[iMin]) < 0 )
                    iMin = j;
            }
            T temp = a[i];
            a[i] = a[iMin];
            a[iMin] = temp; 

        }
    }
    public static void main(String[] args) {

        Integer [] a = { 13, 10 , 17 , 4, 5 , 8};
        System.out.println("Array a before insertion sort: " + Arrays.toString(a));
        insertionSort(a, a.length);
        System.out.println("Array a after insertion sort: " + Arrays.toString(a));

        System.out.println();

        Integer [] b = { 10, 9 , 17 , 6, 40 , 8};
        System.out.println("Array b before selection sort: " + Arrays.toString(b));
        selectionSort(b, b.length);
        System.out.println("Array b after selection sort: " + Arrays.toString(b));
        
    }
}