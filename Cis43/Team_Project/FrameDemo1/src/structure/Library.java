

/**
 * structure
 */

package structure;
import java.util.ArrayList;
public class Library {

    private int bookID; 
    private String bookName;
    
    Library(int bookID, String bookName)
    {
        this.bookID = bookID;
        this.bookName = bookName;
    }

    public void setBookID (int bookID) {
            this.bookID = bookID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookName (String bookName) {
        this.bookName = bookName;
    }
    
    public String getBookName() {
        return bookName;
    }

    // public void addStudent (int id)
    // {
    //     bookID.add(id);
    // }

    // public void removeBook (int id)
    // {
    //     bookID.remove(id);
    // }
    
    // public int getBook(int i) {  
    //     return bookID.get(i);
    // }

    // public void showBooks ()
    // {
    //     for (int i = 0; i < bookID.size(); i++)
    //         System.out.printf(" %s %d: %i\n", "BookID", i, bookID.get(i));
    // } 

}