
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator implements ActionListener
{
	JFrame mainFrame;
	JPanel mainPanel, topPanel, bottomPanel;
	JTextField textField;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPeriod, bEqual, bAdd, bSub, bMul, bDiv, bClear, bBackspace;
	double answer1, answer2, result = 0;
	int operator = 0;
	
	Calculator()
	{
		// Frame //
		mainFrame = new JFrame("Calculator");
		mainFrame.setSize(300,350);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Text Field //
		textField = new JTextField(20);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		
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
		bAdd = new JButton("+");
		bSub = new JButton("-");
		bMul = new JButton("*");
		bDiv = new JButton("/");
		bClear = new JButton("C");
		bBackspace = new JButton("<-");
		
		// Top Panel //
		topPanel = new JPanel();
		topPanel.add(textField);
		
		// Bottom Panel //
		bottomPanel = new JPanel(new GridLayout(4,5));
		bottomPanel.add(b7);
		bottomPanel.add(b8);
		bottomPanel.add(b9);
		bottomPanel.add(bAdd);
		bottomPanel.add(bBackspace);
		bottomPanel.add(b4);
		bottomPanel.add(b5);
		bottomPanel.add(b6);
		bottomPanel.add(bMul);
		bottomPanel.add(bDiv);
		bottomPanel.add(b1);
		bottomPanel.add(b2);
		bottomPanel.add(b3);
		bottomPanel.add(bSub);
		bottomPanel.add(bEqual);
		bottomPanel.add(bClear);
		bottomPanel.add(b0);
		bottomPanel.add(bPeriod);
		
		// Main Panel //
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.PAGE_START);
		mainPanel.add(bottomPanel);
		
		// Adding ActionListener to Buttons //
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
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bClear.addActionListener(this);
		bBackspace.addActionListener(this);
		bEqual.addActionListener(this);
		
		// Adding to JFrame //
		mainFrame.add(mainPanel);
		
		//mainFrame.pack();
		mainFrame.setVisible(true);
		
	}
	
	public void calctoText(JButton b)
	{
		String temp = textField.getText();
		temp = temp + b.getActionCommand();
		textField.setText(temp);
	}
	
	
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
		else if (e.getSource() == bAdd)
		{
			try
			{
				answer1 = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			} 
			catch (Exception Error)
			{
				textField.setText("INPUT NUMBER FIRST");
			}
			
		}
		else if (e.getSource() == bSub)
		{
			try
			{
				answer1 = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			} 
			catch (Exception Error)
			{
				textField.setText("INPUT NUMBER FIRST");
			}
		}
		else if (e.getSource() == bMul)
		{
			try
			{
				answer1 = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			} 
			catch (Exception Error)
			{
				textField.setText("INPUT NUMBER FIRST");
			}
		}
		else if (e.getSource() == bDiv)
		{
			try
			{
				answer1 = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			} 
			catch (Exception Error)
			{
				textField.setText("INPUT NUMBER FIRST");
			}
		}
		else if (e.getSource() == bClear)
		{
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
		else if (e.getSource() == bEqual)
		{
			try
			{
				answer2 = Double.parseDouble(textField.getText());
				int answer3 = (int) answer2;
				switch (operator)
				{
					case 1 : result = answer1 + answer2;
					break;
				
					case 2 : result = answer1 - answer2;
					break;
				
					case 3 : result = answer1 * answer2;
					break;
				
					case 4 : try
							 {
								result = answer1 / answer3;
							 }
							 catch(Exception Error)
							 {
								textField.setText("BUGOK");
							 }
					break;
				
					default : result = 0;
				}
				textField.setText("" + result);
			}
			catch (Exception Error)
			{
				textField.setText("INPUT NUMBER FIRST");
			}
			
		}
	}
	public static void main(String[] args)
	{
		new Calculator();
	}
}