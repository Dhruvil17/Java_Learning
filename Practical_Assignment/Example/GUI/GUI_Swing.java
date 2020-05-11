package Practical_Assignment.Example.GUI;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class exithandler implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		System.exit(0);
	}
}

public class GUI_Swing extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JLabel l1, l2, res, l3, view;
	JTextField t1,t2;
	JButton b1,b2,display, displaygen;
	JCheckBox ch[];
	JRadioButton jr[];
	ButtonGroup gen;
	String[] fruits = {"Apple", "Mango", "Orange"};
	String[] gender = {"Male", "Female"};
	
	GUI_Swing(){
		this.setSize(500,500);
		this.setTitle("My First GUI Application");
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		l1=new JLabel("Enter Value 1:");
		l2=new JLabel("Enter Value 2:");
		res=new JLabel("Result is :");
		l3=new JLabel("Fruits : ");
		view=new JLabel();
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("ADDITION");
		b2=new JButton("EXIT");
		display = new JButton("Display");
		displaygen = new JButton("Display Gender");
		ch=new JCheckBox[fruits.length];
		jr= new JRadioButton[gender.length];
		gen=new ButtonGroup();
		exithandler eh = new exithandler();
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(b1);
		this.add(res);
		this.add(l3);
		for(int i=0;i<fruits.length;i++)
		{
			ch[i] = new JCheckBox(fruits[i]);
			this.add(ch[i]);
		}
		for(int i=0;i<gender.length;i++)
		{
			jr[i] = new JRadioButton(gender[i]);
			gen.add(jr[i]);
			this.add(jr[i]);
		}
		this.add(display);
		this.add(displaygen);
		this.add(view);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(eh);
		display.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				view.setText("");
				for(int i=0;i<fruits.length;i++){
					if(ch[i].isSelected()){
						view.setText(view.getText() + ","+ ch[i].getText());
					}
				}
			}
		});
		
		displaygen.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					view.setText("");
					for(int i=0;i<gender.length;i++){
						if(jr[i].isSelected()){
							view.setText(view.getText() + ","+ jr[i].getText());
						}
					}
				}	
		});
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e){
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		int result = n1+n2;
		res.setText("Result: "+result);
		System.out.println("Action Performed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI_Swing t1 = new GUI_Swing();
	}
}


