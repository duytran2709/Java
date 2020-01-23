
/**
 * student
 */

package structure;
import java.util.ArrayList;
public class Student {

    private int studentID;
    private String studentName;
    private ArrayList<Integer> bookID = new ArrayList<Integer>();

    public Student (int id, String name, ArrayList<Integer> bookID ) {
        studentID = id;
        studentName = name;
        this.bookID = bookID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID( int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName ( ) {
        return studentName;
    }

    public void setStudentID (String studentName) {
        this.studentName = studentName;
    }

    public void addBook (int id)
    {
        bookID.add(id);
    }

    public void removeBook (int id)
    {
        bookID.remove(id);
    }

    // get book at index 
    public int getBook(int index) {  
        return bookID.get(index);
    }

    public void showBooks ()
    {
        for (int i = 0; i < bookID.size(); i++)
            System.out.printf(" %s %d: %i\n", "BookID", i, bookID.get(i));
    }
    
}   