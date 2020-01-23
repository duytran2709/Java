
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class First_Screen extends JFrame {

    private final JLabel label;
    private final JButton start_button; 

    public First_Screen()
    {
        super("Library Checkout");

        setLayout(new FlowLayout());

        // Icon bug = new ImageIcon(getClass().getResource(""));
        label = new JLabel();
        label.setText("Welcome to our library checkout system");
        label.setIcon(new ImageIcon(new ImageIcon("picture1.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
        // put a path of the image - right click on image file -> Properties -> Security tab -> copy Object name
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        start_button = new JButton("Start");

        this.setLayout(new GridBagLayout());
        
        GridBagConstraints gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        add(label,gridConstraints);
        gridConstraints.gridy = 1;
        add(start_button, gridConstraints);

        ButtonHandler handler = new ButtonHandler();
        start_button.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener {
        ArrayList<String> borrowed_books = new ArrayList<String>();

        public void actionPerformed(ActionEvent event) {
            dispose();
            Checkout checkout = new Checkout(borrowed_books);
            checkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            checkout.setLocationRelativeTo(null);
            checkout.setSize(600, 500);
            checkout.setResizable(false);
            checkout.setVisible(true);
        }
    }
}