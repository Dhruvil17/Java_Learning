package Practical_Assignment.Example.Applet_Example;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Applet_MouseL extends Applet implements MouseListener
{
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g)
    {
        addMouseListener(this); 
    }

  public void mouseClicked(MouseEvent me)
    {
      setBackground(Color.green);
    }
 
  public void mouseEntered(MouseEvent me)
    {
      setBackground(Color.yellow);
    }
  public void mouseExited(MouseEvent me)
    {
      setBackground(Color.red);
    }
  public void mousePressed(MouseEvent me)
    {
      setBackground(Color.blue);
    }

 public void mouseReleased(MouseEvent me)   
    {
      setBackground(Color.pink);
    }
}