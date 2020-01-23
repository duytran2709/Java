// Exercise 14.9 Solution: CalculatorFrame.java
// Program creates a GUI that resembles a calculator.
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame 
{
   private JButton[] keys;
   private JPanel keyPadJPanel;
   private JTextField lcdJTextField;

   // constructor sets up GUI
   public CalculatorFrame()
   {
      super( "Calculator" );

       // create lcdJTextField
		// allow user input 

      keys = new JButton[ 16 ]; // array keys contains 16 JButtons 

      // initialize all digit key buttons using a for loop
      

      // initialize all function key buttons, for example keys[ 10 ] = new JButton( "/" );
    

      // set keyPadJPanel layout to grid layout with 4 rows and 4 columns


      // add buttons to keyPadJPanel panel
      // 7, 8, 9, divide
 

      // 4, 5, 6


      // multiply


      // 1, 2, 3


      // subtract


      // 0
 

      // ., =, add


      // add components to (default) border layout
      add( lcdJTextField, BorderLayout.NORTH );
      add( keyPadJPanel, BorderLayout.CENTER );
   } // end CalculatorFrame constructor
} // end class CalculatorFrame

