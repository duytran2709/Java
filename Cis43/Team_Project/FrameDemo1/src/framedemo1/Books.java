package framedemo1;
import java.util.ArrayList;

/**
 * Books
 */
public class Books {

    public static void main(String[] args) {
        ArrayList<String[]> books = new ArrayList<String[]>();
        books.add(new String[]{"Book1", "1"});
        books.add(new String[]{"Book2", "1"});
        books.add(new String[]{"Book3", "1"});
        System.out.print(books);
    }
}