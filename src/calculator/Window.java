package calculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Window extends JFrame  {
	
	JPanel panel, panelDialog;
	
	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18,
	lb19, lb20, lb21, lb22, lb23, lb24, lb25; 
	
	JTextField tf1, tf2, tf3, tf4;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bBackspace, bClear, bPlus, bMinus, bMult, bDiv, bEqual,bPlMin, bZap;
	
	Calculator handler=new Calculator();
	
	Font font1;
	Font font2;
	Font font3;
	Font font4;
	
	String s;
	
	Window(String s){
		super("Калькулятор");
		
		this.s=s;

		setSize(300, 350);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		panel=new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		
		font1 = new Font("Verdana", Font.BOLD, 14);
		font2 = new Font("Arial", Font.PLAIN, 16);
		font3 = new Font("Arial", Font.BOLD, 16);
		font4 = new Font("Arial", Font.PLAIN, 14);
		
		tf1=new JTextField();
		tf1.setBounds(10, 10, 275, 50);
		tf1.setFont(font2);
		tf1.setHorizontalAlignment(tf1.RIGHT);
		tf1.setEditable(false);
		tf1.setBackground(Color.WHITE);
		tf1.setText(s);
		panel.add(tf1);
		
		b1=new JButton("1");
		b1.setBounds(10, 70, 50, 50);
		b1.addActionListener(handler);
		panel.add(b1);
		
		b2=new JButton("2");
		b2.setBounds(65, 70, 50, 50);
		b2.addActionListener(handler);
		panel.add(b2);
		
		b3=new JButton("3");
		b3.setBounds(120, 70, 50, 50);
		b3.addActionListener(handler);
		panel.add(b3);
		
		bBackspace=new JButton("<-");
		bBackspace.setBounds(180, 70, 50, 50);
		bBackspace.setBackground(Color.lightGray);
		bBackspace.addActionListener(handler);
		panel.add(bBackspace);
		
		bClear=new JButton("C");
		bClear.setBounds(235, 70, 50, 50);
		bClear.setBackground(Color.lightGray);
		bClear.addActionListener(handler);
		panel.add(bClear);
		
		b4=new JButton("4");
		b4.setBounds(10, 125, 50, 50);
		b4.addActionListener(handler);
		panel.add(b4);
		
		b5=new JButton("5");
		b5.setBounds(65, 125, 50, 50);
		b5.addActionListener(handler);
		panel.add(b5);
		
		b6=new JButton("6");
		b6.setBounds(120, 125, 50, 50);
		b6.addActionListener(handler);
		panel.add(b6);
		
		bPlus=new JButton("+");
		bPlus.setBounds(180, 125, 50, 50);
		bPlus.setBackground(Color.lightGray);
		bPlus.addActionListener(handler);
		panel.add(bPlus);
		
		bMinus=new JButton("-");
		bMinus.setBounds(235, 125, 50, 50);
		bMinus.setBackground(Color.lightGray);
		bMinus.addActionListener(handler);
		panel.add(bMinus);
		
		b7=new JButton("7");
		b7.setBounds(10, 180, 50, 50);
		b7.addActionListener(handler);
		panel.add(b7);
		
		b8=new JButton("8");
		b8.setBounds(65, 180, 50, 50);
		b8.addActionListener(handler);
		panel.add(b8);
		
		b9=new JButton("9");
		b9.setBounds(120, 180, 50, 50);
		b9.addActionListener(handler);
		panel.add(b9);
		
		bMult=new JButton("x");
		bMult.setBounds(180, 180, 50, 50);
		bMult.setBackground(Color.lightGray);
		bMult.addActionListener(handler);
		panel.add(bMult);
		
		bDiv=new JButton("/");
		bDiv.setBounds(235, 180, 50, 50);
		bDiv.setBackground(Color.lightGray);
		bDiv.addActionListener(handler);
		panel.add(bDiv);
		
		b0=new JButton("0");
		b0.setBounds(10, 235, 50, 50);
		b0.addActionListener(handler);
		panel.add(b0);
		
		bZap=new JButton(".");
		bZap.setBounds(65, 235, 50, 50);
		bZap.addActionListener(handler);
		panel.add(bZap);
		
		bPlMin=new JButton("+/-");
		bPlMin.setBounds(120, 235, 50, 50);
		bPlMin.addActionListener(handler);
		panel.add(bPlMin);
		
		bEqual=new JButton("=");
		bEqual.setBounds(180, 235, 105, 50);
		bEqual.setBackground(Color.lightGray);
		bEqual.addActionListener(handler);
		panel.add(bEqual);
	}
	
}
