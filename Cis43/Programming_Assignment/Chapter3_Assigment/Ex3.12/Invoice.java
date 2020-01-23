/*Exercise 3.12
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. 
An Invoice should include four pieces of information as instance variables
—a part number (type String), a part description (type String), a quantity of the item being purchased (type int) 
and a price per item (double). Your class should have a constructor that initializes the four instance variables. 
Provide a set and a get method for each instance variable. 
In addition, provide a method named getInvoiceAmount that calculates the invoice amount 
(i.e., multiplies the quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. 
If the price per item is not positive, it should be set to 0.0.
 Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities. */

// Exercise 3.12
public class Invoice
{
    
    private String part_number ;
    private String part_description = "";
    private int purchase_quantity = 0;
    private double price_per_item = 0.0;
    
    public Invoice (String number, String description, int quantity, double price)
    {
        this.part_number = number;
        this.part_description = description;
        if (quantity > 0)
            this.purchase_quantity = quantity;
        if (price > 0)
            this.price_per_item = price;
    }

    public void set_partNumber( String number)
    {
        part_number = number;
    }

    public String get_partNumber()
    {
        return part_number;
    }
    
    public void set_partDescription(String description)
    {
        part_description = description;
    }

    public String get_partDescription()
    {
        return part_description;
    }

    public void set_purchaseQuantity( int quantity)
    {
        purchase_quantity = quantity;

    }

    public int get_purchaseQuantity()
    {
        return purchase_quantity;
    }

    public void set_price_per_item( double price)
    {
        price_per_item = price;
    }

    public double get_price_per_item()
    {
        return price_per_item;
    }

    public double getInvoiceAmount ()
    {
        return purchase_quantity * price_per_item; 
    }

}