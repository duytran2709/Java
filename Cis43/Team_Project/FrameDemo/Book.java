
import java.util.ArrayList;
import java.lang.String;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Book {
    public static void main(String[] args) {
        ArrayList<String[]> books = new ArrayList<String[]>();
        books.add(new String[]{"Book1", "1"});
        books.add(new String[]{"Book2", "1"});
        books.add(new String[]{"Book3", "1"});
        
        for (int i = 0; i < books.size(); i++)
        {
            for (String j : books.get(i))
            System.out.printf("%s ", j);
            System.out.println();
        }
    }
    
}