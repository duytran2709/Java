
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.lang.model.util.ElementScanner6;
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
import java.lang.String;

public class Checkout extends JFrame {

    private ArrayList<JCheckBox> books = new ArrayList<JCheckBox>();
    private ArrayList<String> selected_book_list = new ArrayList<String>();
    private ArrayList<String> borrowed_book_list = new ArrayList<String>();
    private JLabel selectedBook_button;
    public final JLabel label1;
    public final JTextField textField1;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JPanel panel2;
    public JPanel panel3;
    public FlowLayout layout;

    public ArrayList<JCheckBox> getBooks() {
        return books;
    }

    public JLabel display_selected_book() {
        return selectedBook_button;
    }

    public ArrayList<String> get_borrowed_book_list() {
        return borrowed_book_list;
    }

    public void set_borrowed_book_list(ArrayList<String> list)
    {
        borrowed_book_list = list;
    }

    public ArrayList<String> get_selected_book_list ()
    {
        return selected_book_list;
    }

    public Checkout(ArrayList<String> borrow_list) { 
        super("Library Checkout");

        for (int i = 0; i < borrow_list.size(); i++)
        {
            borrowed_book_list.add(borrow_list.get(i));
            selected_book_list.add(borrow_list.get(i));
        }

        label1 = new JLabel("Book ID: ");
        label1.setHorizontalAlignment(SwingConstants.LEFT);


        textField1 = new JTextField(10);
        textField1.setHorizontalAlignment(SwingConstants.LEFT);

        button1 = new JButton("SEARCH");
        button2 = new JButton("BORROW");
        button3 = new JButton("RETURN");


        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        Border operBorder = BorderFactory.createTitledBorder("Book list");
        panel2.setBorder(operBorder);



        for (int i = 0; i < 6; i++) {
            if (!(borrowed_book_list.contains("Book" + String.valueOf(i + 1)))) 
            {
                JCheckBox book = new JCheckBox("Book" + String.valueOf(i + 1));
                books.add(book);
            }
        }

        if(books.isEmpty() == true)
        {
            selectedBook_button = new JLabel("All Books are borrowed");
        } else 
            selectedBook_button = new JLabel("Selected Books: ");

        CheckBoxHandler handler = new CheckBoxHandler();
        for (int i = 0; i < books.size(); i++) {
            panel2.add(books.get(i));
            books.get(i).addItemListener(handler);
        }
        Buttonhandler1 buttonHandler = new Buttonhandler1();

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new GridBagLayout());

        GridBagConstraints gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        mainpanel.add(label1, gridConstraints);
        gridConstraints.gridx = 1;
        mainpanel.add(textField1, gridConstraints);

        gridConstraints.gridx = 2;
        mainpanel.add(button1, gridConstraints);
        button1.addActionListener(buttonHandler);
        gridConstraints.gridy = 1;
        mainpanel.add(button3, gridConstraints);
        
        button3.addActionListener((buttonHandler));

        gridConstraints.anchor = GridBagConstraints.LINE_START;
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        mainpanel.add(panel2, gridConstraints);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        gridConstraints.gridwidth = 3;
        mainpanel.add(selectedBook_button, gridConstraints);
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 4;
        mainpanel.add(button2, gridConstraints);

        button2.addActionListener(buttonHandler);
        this.add(mainpanel);

    }

    private class TextFieldHandler implements ActionListener 
    {
       // process textfield events
       @Override
       public void actionPerformed(ActionEvent event)
       {
           
       } 
    } // end private inner class TextFieldHandler

    private class Buttonhandler1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
        if(event.getSource() == button3)
        {
           String input_text = textField1.getText();
           for(int i = 0; i < get_borrowed_book_list().size(); i++)
           {
               get_borrowed_book_list().remove(input_text);
           }
           dispose();
           Checkout checkout = new Checkout(get_borrowed_book_list());
           checkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            checkout.setLocationRelativeTo(null);
            checkout.setSize(600,500);
            checkout.setResizable(false);
            checkout.setVisible(true);
        } 
        else if (event.getSource() == button2)
        {
            dispose();
            Student student = new Student(selected_book_list);
            student.setLocationRelativeTo(null);
            student.setSize(400, 400);
            student.setVisible(true);
        }
        else if (event.getSource() == button1)
            {
                String input_text = textField1.getText();
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(get_borrowed_book_list());
                    if (!(get_borrowed_book_list().contains(input_text))) {
                        System.out.print(get_selected_book_list());
                        System.out.print(books.get(i).getText());
                        System.out.println(input_text);
                        if (books.get(i).getActionCommand().equals(input_text)) {
                            if (get_selected_book_list().contains(input_text))
                                JOptionPane.showMessageDialog(null, "The book was selected");
                            else {
                                books.get(i).setSelected(true);
                                JOptionPane.showMessageDialog(null, "The book is checked");
                            }
                            // System.out.print(get_selected_book_list().get(i));
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "The book is not on the list");
                        break;
                    }
                }

            }

        }
    }

    private class CheckBoxHandler implements ItemListener {
        // respond to checkbox events
        @Override
        public void itemStateChanged(ItemEvent event) {

            String selectedBooks = "<html>Selected Books: ";
                for (int i = 0; i < getBooks().size(); i++) {
                    if (getBooks().get(i).isSelected()) {
                        if (!(get_borrowed_book_list().contains(getBooks().get(i).getText()))) {
                            if (!(get_selected_book_list().contains(getBooks().get(i).getText())))
                                get_selected_book_list().add(getBooks().get(i).getText());
                        }
                        selectedBooks += getBooks().get(i).getText();
                        if (selectedBooks.length() % 6 == 0) {
                            selectedBooks += "<br><blockquote><blockquote><blockquote>";
                        }

                    } else
                        get_selected_book_list().remove(getBooks().get(i).getText());
                }
            System.out.println(get_selected_book_list());
            display_selected_book().setText(selectedBooks + "</blockquote></blockquote></blockquote></html>");

        }
    
    }


}