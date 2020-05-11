package Practical_Assignment.Applet;


import java.applet.Applet;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class Mouse_Click1 extends Applet implements MouseListener
{
    Random ran = new Random();
    private static final long serialVersionUID = 1L;

   Color [] c = {Color.WHITE, Color.BLUE, Color.CYAN, Color.GRAY, Color.GREEN, Color.MAGENTA, Color.RED, Color.ORANGE, Color.YELLOW, Color.PINK};

    int x, y;
    
    boolean clickedState = false;

    public void init() {
        setBackground(Color.BLACK);
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(c[ran.nextInt(9)]);
        if(clickedState)
        {
            g.fillOval(x-50, y-50, 100, 100);
            clickedState = false;
        }
    }

    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        clickedState = true;
        repaint();
    }

    public void mouseEntered(MouseEvent e){};
    public void mousePressed(MouseEvent e){};
    public void mouseReleased(MouseEvent e){};
    public void mouseExited(MouseEvent e){};
}