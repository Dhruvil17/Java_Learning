package Practical_Assignment.Example.Applet_Example;

import java.awt.Graphics;
import java.applet.*;


public class MyApplet extends Applet
{
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g)
   {
       g.drawString("Hello from Applet",250,250);      
   }
}