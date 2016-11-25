//Zachary Price
//Chapter 8, #2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Roman extends JApplet
{	
	private JTextField numeralTF;
	private int number, i, counterM = 0, counterD = 0, counterC = 0, counterL = 0, counterX = 0, counterV = 0, counterI = 0;
	private String str;
	private char currentNumeral;
	
	public void init()
	{
	}
	
	public void numeral()
	{
		str = numeralTF.getText();
		
		for(i = 0; i < str.length(); i++)
		{
			currentNumeral = str.charAt(i);
		
			switch (currentNumeral)
			{
				case 'M':
					if (counterM != 3)
					{
						number = number + 1000;
						counterM++;
					}
					break;
		
				case 'D':
					if (counterD != 1)
					{
						number = number + 500;
						counterD++;
					}
					break;
				
				case 'C':
					if (counterC != 3)
					{
						number = number + 100;
						counterC++;
					}
					break;
				
				case 'L':
					if (counterL != 1)
					{
						number = number + 50;
						counterL++;
					}
					break;
			
				case 'X':
					if (counterX != 3)
					{
						number = number + 10;
						counterX++;
					}
					break;
				
				case 'V':
					if (counterV != 1)
					{
						number = number + 5;
						counterV++;
					}
					break;
			
				case 'I':
					if (counterI != 3)
					{
						number = number + 1;
						counterI++;
					}
					break;
			}
		}
	}
}