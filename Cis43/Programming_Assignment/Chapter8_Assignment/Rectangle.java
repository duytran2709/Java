/**
 * Chapter8_4
 * (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. 
Provide methods that calculate the rectangle’s perimeter and area. 
It has set and get methods for both length and width. 
The set methods should verify that length and width are each floating-point numbers larger than 0.0 
and less than 20.0. Write a program to test class Rectangle.
 */

public class Rectangle {

    private float length = 1;
    private float width = 1;

    public void setLength(float length) {
        if (length > 0.0 && length < 20.0)
            this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width < 20.0)
            this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public float calculateArea() {
        return width * length;
    }

    public float calculatePerimeter() {
        return 2 * (width + length);
    }

    public String toString() {

        return String.format("Display:\n\tLength: %.6f\n\tWidth: %.6f\n\tPerimeter: %.6f\n\tArea: %.6f\n", length,
                width, calculatePerimeter(), calculateArea());
    }
}



