
/**
 * Duy Tran - Cis44
 * Assignment3
 * OverloadedMethods
 * 1-   Write a generic method called minimum that accepts four items and find the minimum of them. 
 * 2-   Test your class with Integer, Double, Character, String and Car objects.
 */

public class OverloadedMethods {

    public static void main(String[] args) {


        Integer[] integerArray  = {2,3,4};

        printArray(integerArray);

        Integer integer1 = new Integer(2);
        Integer integer2 = new Integer(8);
        Integer integer3 = new Integer(5);
        
        System.out.print("The maximum integer: ");
        System.out.println(minimum(integer1,integer2,integer3));

        Double double1 = new Double(2.3);
        Double double2 = new Double(4.5);
        Double double3 = new Double(9.1);

        System.out.print("The maximum double: ");
        System.out.println(minimum(double1, double2, double3));

        String string1 = new String("duy");
        String string2 = new String("huyen");
        String string3 = new String("khoa");

        System.out.print("The maximum String: ");
        System.out.println(minimum(string1, string2, string3));

        Character char1 = new Character('n');
        Character char2 = new Character('h');
        Character char3 = new Character('u');
        System.out.print("The maximum character: ");
        System.out.println(minimum(char1, char2, char3));

        Car car1 = new Car ();
        Car car2 = new Car ();
        Car car3 = new Car ();

        car1.goFast(2);
        car2.goFast(10);
        car3.goFast(5);

        System.out.println("The car whose speed is minimum: ");
        System.out.println(minimum(car1, car2, car3));

    }

    public static <T> void printArray(T[] inputArray)
    {
        for(T element: inputArray)
        System.out.printf("%s ", element);
        System.out.println();
    }

    public static <T extends Comparable <T>> T maximum ( T x, T y, T z)
    {
        T max = x;

        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;

        return max; 
    }

    public static <T extends Comparable <T>> T minimum ( T x, T y, T z)
    {
        T min = x;
        
        if (y.compareTo(min) < 0) min = y;
        if (z.compareTo(min) < 0) min = z;

        return min;
    }


}