import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SavingScreenPanel extends JPanel implements ActionListener {
   // random-number generator
   private static final Random random = new Random();
   private Timer timer;

   // constructor sets window's title bar string and dimensions
   public SavingScreenPanel() {
      timer = new Timer(1000, this); // create the timer, every 1000 milliseconds, the timer triggers an event on the
                                     // panel
      timer.start();
   }

   // draw lines
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      int x, y, width, height, startAngle, arcAngle;

      for (int i = 0; i < 100; i++) {
         x = random.nextInt(300);
         y = random.nextInt(300);
         width = random.nextInt(300);
         height = random.nextInt(300);
         startAngle = random.nextInt(180);
         arcAngle = random.nextInt(360);

         g.drawArc(x, y, width, height, startAngle, arcAngle);
         g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
      }
   } // end method paintComponent

   // repaint JPanel
   public void actionPerformed(ActionEvent actionEvent) {
      repaint();
   } // end method actionPerformed
} // end class SaverJPanel
