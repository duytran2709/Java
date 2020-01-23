package framedemo1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.util.List;
import java.util.ArrayList;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Check extends JFrame {
    JLabel testText; //test text
    JCheckBox[] books = new JCheckBox[3];
    String[] names = {"001 Book1", "002 Book2", "003 Book3"};
    List selectedBooks = new ArrayList();
    List borrowBooks = new ArrayList();
    
    Check(){
        this.setTitle("Library Checkout");
        
        //this.setLayout(new FlowLayout());
        
        JLabel a = new JLabel("Book List");
        this.add(a);
        
        //Borrow button
        JButton borrow = new JButton("Borrow");
        
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e2){                      
                if(selectedBooks.contains("001") && !borrowBooks.contains("001"))
                    borrowBooks.add("001");
                if(selectedBooks.contains("002") && !borrowBooks.contains("002"))
                    borrowBooks.add("002");
                if(selectedBooks.contains("003") && !borrowBooks.contains("003"))
                    borrowBooks.add("003");
            }
        };
        
        borrow.addActionListener(listener);
        
        for(int i = 0; i < books.length; i++){
            books[i] = new JCheckBox(names[i]);
            books[i].setBorderPainted(true);
            books[i].addItemListener(new MyItemListener());
            this.add(books[i]);
        }
        
        //test text
        testText = new JLabel("test");
        this.add(testText);
        this.add(borrow);
        this.setSize(300,400);
        this.setVisible(true);

        


    }
    
    class MyItemListener implements ItemListener{
        public void itemSteteChanged(ItemEvent e1){
            if(e1.getItem() == books[0] && e1.getStateChange() == ItemEvent.SELECTED)
                selectedBooks.add("001");
            if(e1.getItem() == books[1] && e1.getStateChange() == ItemEvent.SELECTED)
                selectedBooks.add("002");
            if(e1.getItem() == books[2] && e1.getStateChange() == ItemEvent.SELECTED)
                selectedBooks.add("003");
            //test text
            testText.setText("Selected: " + selectedBooks + "\nWill be borrowed: " + borrowBooks);
        }
    }
}

// public class FrameDemo2 {

//     public static void main(String[] args) {
//         new Check();
//     }
    
// }