public class InvoiceTest
{
    public static void main(String[] args) {
        
        Invoice invoiceTest = new Invoice("A123", "speaker", 3, 4.5 );

        System.out.printf("%n part number: %s", invoiceTest.get_partNumber());
        System.out.printf("%n part description: %s", invoiceTest.get_partDescription());
        System.out.printf("%n purchased quantity: %d", invoiceTest.get_purchaseQuantity());
        System.out.printf("%n price per item: $%.2f", invoiceTest.get_price_per_item());
        System.out.printf("%n Invoice Amount: $%.2f", invoiceTest.getInvoiceAmount() );
        System.out.println();
    }
}


