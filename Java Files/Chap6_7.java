//Zachary Price
//Chapter 6, #7

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chap6_7 extends JFrame
{
	private JLabel amountL, yearL, interestL, totalL;
	private JTextField amountTF, yearTF, interestTF, totalTF;
	private TotalHandler totalHandler;
	int total;
	
	public Chap6_7()
	{
		setTitle("Conversion");
		Container herro = getContentPane();
		herro.setLayout(new GridLayout(5, 2));
		
		amountL = new JLabel("Amount in Dollars: ", SwingConstants.RIGHT);
		yearL = new JLabel("Year(s): ", SwingConstants.RIGHT);
		interestL = new JLabel("Interest Percentage: ", SwingConstants.RIGHT);
		totalL = new JLabel("Total: ", SwingConstants.RIGHT);
		amountTF = new JTextField(10);
		yearTF = new JTextField(10);
		interestTF = new JTextField(10);
		totalTF = new JTextField(10);
		totalHandler = new TotalHandler();
		
		amountTF.addActionListener(totalHandler);
		yearTF.addActionListener(totalHandler);
		interestTF.addActionListener(totalHandler);
		totalTF.addActionListener(totalHandler);
		
		herro.add(amountL);
		herro.add(amountTF);
		herro.add(yearL);
		herro.add(yearTF);
		herro.add(interestL);
		herro.add(interestTF);
		herro.add(totalL);
		herro.add(totalTF);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}//end method Chap6_7
	
	private class TotalHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double amount, interest, total;
			int year;
			
			amount = Double.parseDouble(amountTF.getText());
			interest = Double.parseDouble(interestTF.getText());
			year = Integer.parseInt(yearTF.getText());
			
			total = amount * (Math.pow((1 + interest / 100), year));
			
			interestTF.setText(interest + " %");
			amountTF.setText(String.format("$ %.2f", amount));
			totalTF.setText(String.format("$ %.2f", total));
		}
	}//end class TotalHandler
	
	public static void main(String[] args)
	{
			Chap6_7 fred = new Chap6_7();	
	}//end method main
	
}//end class Chap6_7