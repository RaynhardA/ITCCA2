/*
	Raynhard Anthony D. Yray
	ITCC - A2
	October 20, 2020
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Currency implements ActionListener
{
	JFrame frame;
	JPanel mainPanel, topPanel, bottomPanel;
	JLabel rateText, amountText, outputText;
	JTextField rateTField, amountTField, outputTField;
	double rate = 0;
	double amount = 0;
	Currency()
	{
		
		// Frame //
		frame = new JFrame("Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(500,150);
		frame.setResizable(false);
		
		// Labels //
		rateText = new JLabel("Current Rate: ");
		amountText = new JLabel (" Amount to Convert: ");
		outputText = new JLabel("Output: ");
		
		// Text Fields //
		rateTField = new JTextField(10);
		amountTField = new JTextField(10);
		outputTField = new JTextField(10);
		outputTField.setEditable(false);
	
		// Top Panel //
		topPanel = new JPanel();
		topPanel.add(rateText);
		topPanel.add(rateTField);
		topPanel.add(amountText);
		topPanel.add(amountTField);
		
		// Bottom Panel //
		bottomPanel = new JPanel();
		bottomPanel.add(outputText);
		bottomPanel.add(outputTField);
		
		// Main Panel //
		mainPanel = new JPanel(new GridLayout(2,1));	
		mainPanel.add(topPanel);
		mainPanel.add(bottomPanel);
		
		
		// Action Listener //
		rateTField.addActionListener(this);
		amountTField.addActionListener(this);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String answerString1 = rateTField.getText();
			String answerString2 = amountTField.getText();
			
			double answer1 = Double.parseDouble(answerString1);
			double answer2 = Double.parseDouble(answerString2);
			double result = answer1 * answer2;
		
			outputTField.setText(Double.toString(result));
		}
		catch (Exception Error)
		{
			outputTField.setText("Input Error");
		}
	}
	public static void main(String[] args)
	{
		new Currency();
	}
}