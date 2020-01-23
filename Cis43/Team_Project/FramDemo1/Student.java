import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Student extends JFrame {

    public final JLabel student_Name;
    public final JLabel student_ID;
    public JTextField studentNameField;
    public JTextField studentIDField;
    public JButton doneButton;
    public ArrayList<String> selected_book_list = new ArrayList<String>();


    public Student(ArrayList<String> selected_books)
    {
        super("Student Information");
        for(int i = 0; i < selected_books.size(); i++)
        {
            this.selected_book_list.add(selected_books.get(i));
        }


        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new GridBagLayout()); 

        student_Name = new JLabel("Student Name: ");
        student_ID = new JLabel("Student ID: ");
        studentNameField = new JTextField(10);
        studentIDField = new JTextField(10); 


        doneButton = new JButton("Done");
        ButtonHandler handler1 = new ButtonHandler();
        doneButton.addActionListener(handler1);

        GridBagConstraints gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        mainpanel.add(student_Name, gridConstraints);
        gridConstraints.gridx = 1;
        mainpanel.add(studentNameField, gridConstraints);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        mainpanel.add(student_ID, gridConstraints);
        gridConstraints.gridx = 1;
        mainpanel.add(studentIDField, gridConstraints);
        gridConstraints.gridy = 2;
        gridConstraints.gridheight = 2;
        mainpanel.add(doneButton, gridConstraints);

        this.add(mainpanel);

    }

    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent event)
        {
           
            Checkout checkout = new Checkout(selected_book_list);
            System.out.println(checkout.get_borrowed_book_list());
            dispose();
            checkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            checkout.setLocationRelativeTo(null);
            checkout.setSize(600,500);
            checkout.setResizable(false);
            checkout.setVisible(true);
                
        }

        
    }
}