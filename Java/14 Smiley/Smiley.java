//TODO OUTPUT

import java.applet.*;
import java.awt.*;

public class Smiley extends Applet{
    public void print(Graphics g){
        g.drawOval(80, 70, 150, 150);
        g.setColor(Color.RED);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.setColor(Color.GREEN);
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}