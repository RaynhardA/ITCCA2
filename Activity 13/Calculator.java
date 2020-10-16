/*
	Raynhard Anthony D. Yray
	ITCC - A2
	October 16, 2020
*/

import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
	JFrame frame;
	JTextField textField;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPeriod, bEqual, bAddition, bSubtraction, bMultiplication, bDivision, bClear, bBackspace;
	double answer1, answer2, result = 0;
	int operator = 0;
	
	Calculator()
	{
		// Frame //
		frame = new JFrame("Calculator");
		frame.setSize(400,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
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
		
		// TextField //
		textField = new JTextField(17);
		textField.setBounds(10,10,350,40);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		
		
		// Bounds //
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
		
		// Adding to JFrame //
		frame.add(textField);
		frame.add(b0);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(bPeriod);
		frame.add(bEqual);
		frame.add(bAddition);
		frame.add(bSubtraction);
		frame.add(bMultiplication);
		frame.add(bDivision);
		frame.add(bClear);
		frame.add(bBackspace);
		
		// ActionListener to Buttons //
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bPeriod.addActionListener(this);
		bAddition.addActionListener(this);
		bSubtraction.addActionListener(this);
		bMultiplication.addActionListener(this);
		bDivision.addActionListener(this);
		bBackspace.addActionListener(this);
		bClear.addActionListener(this);
		bEqual.addActionListener(this);
		
		// set the Frame to Visible //
		frame.setVisible(true);
	}
	
	// JButtons to TextField method // 
	public void calctoText(JButton e)
	{
		String temp = textField.getText();
		temp = temp + e.getActionCommand();
		textField.setText(temp);
	}
	
	// JButtons to TextField //
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b0)
		{
			calctoText(b0);
		}
		else if (e.getSource() == b1)
		{
			calctoText(b1);
		}
		else if (e.getSource() == b2)
		{
			calctoText(b2);
		}
		else if (e.getSource() == b3)
		{
			calctoText(b3);
		}
		else if (e.getSource() == b4)
		{
			calctoText(b4);
		}
		else if (e.getSource() == b5)
		{
			calctoText(b5);
		}
		else if (e.getSource() == b6)
		{
			calctoText(b6);
		}
		else if (e.getSource() == b7)
		{
			calctoText(b7);
		}
		else if (e.getSource() == b8)
		{
			calctoText(b8);
		}
		else if (e.getSource() == b9)
		{
			calctoText(b9);
		}
		else if (e.getSource() == bPeriod)
		{
			calctoText(bPeriod);
		}
		else if (e.getSource() == bAddition) 
		{
			answer1 = Double.parseDouble(textField.getText());
			operator = 1;
			textField.setText("");
		}
		else if (e.getSource() == bSubtraction)
		{
			answer1 = Double.parseDouble(textField.getText());
			operator = 2;
			textField.setText("");
		}
		else if (e.getSource() == bMultiplication)
		{
			answer1 = Double.parseDouble(textField.getText());
			operator = 3;
			textField.setText("");
		}
		else if (e.getSource() == bDivision)
		{
			answer1 = Double.parseDouble(textField.getText());
			operator = 4;
			textField.setText("");
		}
		else if (e.getSource() == bBackspace)
		{
			String temps;
			temps = textField.getText();
			int size = temps.length();
			String tempString = "";
			for (int i = 0; i < size - 1; i++)
			{
				tempString = tempString + temps.charAt(i);
			}
			textField.setText(tempString);
		}
		else if (e.getSource() == bClear)
		{
			textField.setText("");
		}
		else if (e.getSource() == bEqual) //Get Result and do the operations//
		{
			answer2 = Double.parseDouble(textField.getText());
			String resultString;
			switch(operator)
			{
				case 1 : result = answer1 + answer2;
				break;
				
				case 2 : result = answer1 - answer2;
				break;
				
				case 3 : result = answer1 * answer2;
				break;
				
				case 4 : result = answer1 / answer2;
				break;
				
				default : result = 0;
			}
			
			//resultString = String.format("%.0f", result);
			textField.setText("" + result);
		}
	}
	public static void main(String[] args)
	{
		new Calculator();
	}
}
