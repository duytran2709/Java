
/**
 * InnerScreenSaver
 */

import javax.swing.JFrame;
public class ScreenSaver {
    public static void main(String[] args)
    {
       JFrame frame = new JFrame("Drawing random lines");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       SavingScreenPanel saverJPanel = new SavingScreenPanel();
       frame.add(saverJPanel);
       frame.setSize(425, 400);
       frame.setVisible(true);
       
    }
    
}
