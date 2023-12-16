//TODO OUTPUT

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
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
