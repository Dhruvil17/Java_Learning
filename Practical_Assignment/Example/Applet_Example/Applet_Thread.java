package Practical_Assignment.Example.Applet_Example;

import java.applet.Applet;
import java.awt.*;


public class Applet_Thread extends Applet implements Runnable {

    private static final long serialVersionUID = 1L;
    int x,y;

    public void init() {
        x = 0; y = 40;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x = x + 10;
            if (x > 450)
            {   
                y+=25;
                x = 0;
            }

            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }

    public void paint(Graphics g) {
        Font f1 = new Font("Arial", Font.BOLD, 25);     
        g.setFont(f1);
        g.drawString("Hello", x, y);
    }
}