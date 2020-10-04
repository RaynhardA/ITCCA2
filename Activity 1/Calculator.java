/*
	Raynhard Anthony D. Yray
	ITCC - A2
	October 5, 2020
*/

import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame{
	 JTextField textField;
	 JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPeriod, bEqual, bAddition, bSubtraction, bMultiplication, bDivision, bClear, bBackspace;
	
	/* Constructor */
	public Calculator(){
		// Frame //
		setTitle("Calculator");
		setSize(400,420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Buttons //
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bPeriod = new JButton(".");
		bEqual = new JButton("=");
		bAddition = new JButton("+");
		bSubtraction = new JButton("-");
		bMultiplication = new JButton("*");
		bDivision = new JButton("/");
		bClear = new JButton("C");
		bBackspace = new JButton("<--");

		b0.setBounds(80,310,50,50);
		b1.setBounds(20,240,50,50);
		b2.setBounds(80,240,50,50);
		b3.setBounds(140,240,50,50);
		b4.setBounds(20,170,50,50);
		b5.setBounds(80,170,50,50);
		b6.setBounds(140,170,50,50);
		b7.setBounds(20,100,50,50);
		b8.setBounds(80,100,50,50);
		b9.setBounds(140,100,50,50);
		bClear.setBounds(140,310,50,50);
		bBackspace.setBounds(240,100,50,50);
		bAddition.setBounds(300,100,50,50);
		bSubtraction.setBounds(240,170,50,50);
		bMultiplication.setBounds(300,170,50,50);
		bDivision.setBounds(240,240,50,50);
		bEqual.setBounds(300,240,50,50);
		bPeriod.setBounds(300,310,50,50);
		bClear.setBounds(240,310,50,50);
		
		// TextField //
		textField = new JTextField(17);
		textField.setBounds(10,10,350,40);
		textField.setEditable(false);

		// adding to JFrame //
		add(textField);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(bPeriod);
		add(bEqual);
		add(bAddition);
		add(bSubtraction);
		add(bMultiplication);
		add(bDivision);
		add(bClear);
		add(bBackspace);
		
	}
	
	public static void main(String[] args){
	new Calculator().setVisible(true);
	}
}