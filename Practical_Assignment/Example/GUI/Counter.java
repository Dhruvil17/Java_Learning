package Practical_Assignment.Example.GUI;

import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Counter extends JFrame
{
    private static final long serialVersionUID = 1L;
    
    private JLabel lb;
    private JTextField tf;
    private JButton bt,bt1;
    private int count = 0;

    Counter()
    {
        setTitle("Counter Window");
        setSize(300, 300);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.setSize(0, 0);
        p2.setSize(200, 200);

        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));

        lb = new JLabel("Counter :");
        tf = new JTextField(count +" ", 10);
        bt = new JButton("Count");
        bt1 = new JButton("Reset");

        tf.setEditable(false);

        p1.add(lb);
        p1.add(tf);
        p1.add(bt);
        p2.add(bt1);

        add(p1, BorderLayout.NORTH);
        add(p2 ,BorderLayout.CENTER);

        bt.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                ++count;
                tf.setText(count + " ");
            }
        });

        bt1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                count = 0;
                tf.setText(count + " ");
            }
        });
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Counter ct = new Counter();
    }
}