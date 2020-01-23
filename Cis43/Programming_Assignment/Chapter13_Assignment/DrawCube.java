import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCube extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.draw(new Rectangle2D.Double(100, 100, 100, 100));
            g2d.draw(new Rectangle2D.Double(120, 120, 100, 100));

            g2d.draw(new Line2D.Double(100, 100, 120, 120));
            g2d.draw(new Line2D.Double(200, 100, 220, 120));
            g2d.draw(new Line2D.Double(100, 200, 120, 220));
            g2d.draw(new Line2D.Double(200, 200, 220, 220));
        }
}

    




