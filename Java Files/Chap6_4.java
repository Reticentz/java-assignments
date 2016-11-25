//Zachary Price
//Chapter 6, #4

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chap6_4 extends JFrame
{
	private JLabel characterL, integerL, orL;
	private JTextField characterTF, integerTF;
	private CharHandler charHandler;
	private IntHandler intHandler;
	
	public Chap6_4()
	{
		characterL = new JLabel("Please enter a character: ", SwingConstants.RIGHT);
		orL = new JLabel("-OR-", SwingConstants.CENTER);
		integerL = new JLabel("Please enter an integer: ", SwingConstants.RIGHT);
		
		characterTF = new JTextField(1);
		integerTF = new JTextField(1);
		
		setTitle("Conversion");
		
		Container yay = getContentPane();
		yay.setLayout(new GridLayout(1, 5));
		yay.add(characterL);
		yay.add(characterTF);
		yay.add(orL);
		yay.add(integerL);
		yay.add(integerTF);
		
		charHandler = new CharHandler();
		intHandler = new IntHandler();
		
		characterTF.addActionListener(charHandler);
		integerTF.addActionListener(intHandler);
		
		setSize(950, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//end method Chap6_4
	
	private class CharHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			char character;
			int integer;
			String characterStr;
			
			characterStr = characterTF.getText();
			character = characterStr.charAt(0);
			
			integer = (int)(character);
			
			integerTF.setText("" + integer);
			
		}
	}//end class CharHandler
	
	private class IntHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			char character;
			int integer;
			
			integer = Integer.parseInt(integerTF.getText());
			
			if (integer < 32 || integer > 255)
				integerTF.setText("Integer entered is out of range!");
			else
			{
				character = (char)(integer);
				characterTF.setText("" + character);
			}//end else
			
		}//end actionPerformed
	}//end class IntHandler
	public static void main(String[] args)
	{
			Chap6_4 fred = new Chap6_4();	
	}//end method main
	
}//end class Chap6_4