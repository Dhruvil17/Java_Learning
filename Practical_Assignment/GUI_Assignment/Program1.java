package Practical_Assignment.GUI_Assignment;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Program1 extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JButton b_Add,b_Clear;
    private JTextArea ta;
    private JTextField tf;
    private JPanel p_ta,p_tf,p_bt;

    public Program1()
    {
        this.setTitle("Program_1");
        this.setSize(500, 500);
        p_ta = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p_tf = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p_bt = new JPanel(new FlowLayout(FlowLayout.CENTER));

        add(p_ta, BorderLayout.NORTH);
        add(p_tf, BorderLayout.CENTER);
        add(p_bt, BorderLayout.SOUTH);

        ta = new JTextArea("",20,20);
        tf = new JTextField("", 20);
        b_Add = new JButton("Add");
        b_Clear = new JButton("Clear");

        p_ta.add(ta);
        p_tf.add(tf);
        p_bt.add(b_Add);
        p_bt.add(b_Clear);

        b_Add.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                ta.append(tf.getText() + "\n");
                tf.selectAll();
                tf.replaceSelection("");
            }
        });

        b_Clear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                ta.selectAll();
                ta.replaceSelection("");
            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Program1 p1 = new Program1();
    }
}