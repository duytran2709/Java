// Exercise 14.12 Solution: ConvertFrame.java
// Temperature-conversion program
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertFrame extends JFrame 
{
   //declare controls
    // label to prompt user to enter Fahrenheit
    // label to display temperature in Celsius
    // textfield to enter temperature

   // constructor sets up GUI
   public ConvertFrame()
   {
      super( "Temperature converter" );

      // Create label for prompt;
	  // Create textfield for Fahrenheit
	  // Create label for display

      // register anonymous action listener
      temperatureF.addActionListener(
         new ActionListener() // anonymous inner class
         {
            public void actionPerformed(ActionEvent e)
            {
               //retrieve temp from textfield 
			   //calculate celsius conversion
			   // set display label text to result 
               
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      // add controls to the panel using default borderlayout
      // add prompt label to north region
      // add text field to center region
      // add display label to south region
   } // end ConvertFrame constructor
} // end class ConvertFrame



