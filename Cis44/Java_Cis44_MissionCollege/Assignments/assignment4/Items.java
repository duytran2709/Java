/**
 * Items
 * Write a class called Item that has a string field called name 
 * and a double field called price and an integer field called quantity. 
 * In main, create a bag of type Item and place several item objects in the bag. 
 * Then in main calculate the total price of items purchased.
 *  You may remove each item and add the price to a total variable in a loop. 
 * The loop should end when the bag is empty. 
 */


public class Items
{
    private final String name;
    private final double price;
    private int quantity;

    public Items(final String name, final double price, int quantiy)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantiy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    
}