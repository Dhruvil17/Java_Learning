package Practical_Assignment.Example.Applet_Example;

import java.applet.Applet;
import java.awt.*;


public class Applet_Update extends Applet implements Runnable {

    private static final long serialVersionUID = 1L;
    int x, y;

    public void init() {
        x = y = 0;
        setBackground(Color.WHITE);

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 10, 10);
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > 450)
            {    
                x = 0;
                y += 5;
            }
                
            if (y > 450)
                y = 0;

            repaint();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void update(Graphics g) {
        paint(g);
    }
}