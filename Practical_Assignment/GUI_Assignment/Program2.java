package Practical_Assignment.GUI_Assignment;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Program2 extends JFrame implements ActionListener
{
    
    private static final long serialVersionUID = 1L;
    private JMenuBar mb;
    private JMenu file,edit,color;
    private static JMenuItem qt,er,c1,c2,c3,c4,c5;

    public Program2()
    {
        this.getContentPane().setBackground(Color.WHITE);
        setTitle("Program_2");
        setSize(500, 500);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        color = new JMenu("Colors");
        qt = new JMenuItem("Quit");
        er = new JMenuItem("Erase");
        c1 = new JMenuItem("Red");
        c2 = new JMenuItem("Blue");
        c3 = new JMenuItem("Green");
        c4 = new JMenuItem("Pink");
        c5 = new JMenuItem("Black");

        file.add(qt);
        edit.add(er);
        color.add(c1);
        color.add(c2);
        color.add(c3);
        color.add(c4);
        color.add(c5);

        mb.add(file);
        mb.add(edit);
        mb.add(color);

        setJMenuBar(mb);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();

        if(str.equals("Quit"))
            System.exit(0);
        else if(str.equals("Erase"))
            this.getContentPane().setBackground(Color.WHITE);
        else if(str.equals("Red"))
            this.getContentPane().setBackground(Color.RED);
        else if(str.equals("Blue"))
            this.getContentPane().setBackground(Color.BLUE);
        else if(str.equals("Green"))
            this.getContentPane().setBackground(Color.GREEN);
        else if(str.equals("Pink"))
            this.getContentPane().setBackground(Color.PINK);
        else if(str.equals("Black"))
            this.getContentPane().setBackground(Color.BLACK);
    }  
    
    public static void main(String[] args) {
        Program2 m = new Program2();

        qt.addActionListener(m);
        er.addActionListener(m);
        c1.addActionListener(m);
        c2.addActionListener(m);
        c3.addActionListener(m);
        c4.addActionListener(m);
        c5.addActionListener(m);
    }
}