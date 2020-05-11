package Practical_Assignment.Example.Applet_Example;

import java.applet.Applet;
import java.awt.*;
// import javax.swing.JApplet;

public class MyJAaplet extends Applet {
    private static final long serialVersionUID = 1L;

    String str;
    int i;

    public void init() {
        setBackground(Color.YELLOW);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Hello", 40, 40);
        setBackground(Color.MAGENTA);
        System.out.println("Paint :");
    }

    public void start()
    {
        setBackground(Color.DARK_GRAY);
        System.out.println("Start : ");  
    }
 
    public void stop()
    {
        System.out.println("Stop : ");
    }

    public void destroy()
    {
        System.out.println("Applet destroyed");
    }
    
}