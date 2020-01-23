import javax.swing.JFrame;

/**
 * InnerTest
 */
public class Display {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawCube shapesJPanel = new DrawCube();

        frame.add(shapesJPanel);
        frame.setLocationRelativeTo(null);
        frame.setSize(425, 400);
        frame.setVisible(true);

    }
    
}
