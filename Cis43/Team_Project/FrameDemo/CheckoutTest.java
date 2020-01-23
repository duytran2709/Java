
/**
 * CheckoutTest
 */
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;
public class CheckoutTest {

    
    public static void main(String[] args) {
        // ArrayList<String> borrowed_books = new ArrayList<String>();
        // ArrayList selected_books = new ArrayList();
        ArrayList<String> borrowed_books = new ArrayList<String>();

        Checkout checkout = new Checkout(borrowed_books);
        checkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkout.setLocationRelativeTo(null);
        checkout.setSize(600,500);
        checkout.setResizable(false);
        checkout.setVisible(true);
        // selected_books = (ArrayList) checkout.get_selected_book_list().clone();

        // Student student = new Student(selected_books);
        // student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // student.setLocationRelativeTo(null);
        // student.setSize(350,400);
        // student.setResizable(true);
        // checkout.setVisible(true);
    }
}