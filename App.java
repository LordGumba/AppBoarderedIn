
import java.awt.*;
import javax.swing.JComponent;



class ShapeDrawing extends JComponent {
    int x = 1, y = 1;
    
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        x = x - 1;
        y = y - 1;
        g2.drawOval(x, y, 20, 20);
  }
}
