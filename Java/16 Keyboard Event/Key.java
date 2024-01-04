//TODO OUTPUT

// AIM

// Write a program to track keyboard events on an applet.

// Algorithm
// Step 01 : Start
// Step 02 : Create a class that extends applet and implements KeyListener
// Step 03 : Initialize the applet
// Step 04 : Associate KeyListener with the required components
// Step 05 : Display the frame
// Step 06 : The methods getKeyCode() & getKeyChar() give the unicode and character representation of the key pressed respectively
// Step 07 : Use these methods to display the necessary messages in the status bar
// Step 08 : Stop

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* 
<applet code=Key.class width=500 height=500>
</applet>
*/

public class Key extends Applet implements KeyListener{
    int x=20, y=30;
    String msg = "KeyEvents -- > ";

    public void init(){
        addKeyListener(this);
        requestFocus();

        setBackground(Color.GRAY);
        setForeground(Color.WHITE);
    }

    public void keyPressed(KeyEvent k){
        showStatus("KeyDown");
        setBackground(Color.GREEN);

        int key = k.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                showStatus("Move to UP");
                break;

            case KeyEvent.VK_DOWN:
                showStatus("Move to DOWN");
                break;
            
            case KeyEvent.VK_LEFT:
                showStatus("Move to LEFT");
                break;
            
            case KeyEvent.VK_RIGHT:
                showStatus("Move to RIGHT");
                break;
            
        }
        repaint();
    }

    public void keyReleased(KeyEvent k ){
        showStatus("Key UP");
        setBackground(Color.GRAY);
    }

    public void keyTyped(KeyEvent k){
        msg += k.getKeyChar();
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg, x, y);
    }
}
