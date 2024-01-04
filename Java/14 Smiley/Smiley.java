//TODO OUTPUT
 
// AIM 

// Create an applet for displaying smiling face.

// Algorithm
// Step 01 : Start
// Step 02 : Create a class Smiley inherited from Applet in package java.applet
// Step 03 : Create method paint() and pass an object of Graphics to it
// Step 04 : Using drawOval() method, draw oval shape as the outline of the emoji with suitable co-ordinates
// Step 05 : Select color to be filled using setColor() method
// Step 06 : Using fillOval() method, draw two oval shapes for the eyes of the emoji with suitable co-ordinates
// Step 07 : Using drawArc() method, draw an arc for the smiley emoji with suitable co-ordinates
// Step 08 : Stop

import java.applet.*;
import java.awt.*;

/* 
<applet code=Smiley.class width=500 height=500>
</applet>
*/

public class Smiley extends Applet{
    public void paint(Graphics g){
        g.drawOval(80, 70, 150, 150);
        g.setColor(Color.RED);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.setColor(Color.GREEN);
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}
