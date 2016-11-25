// Zachary Price
//Chapter 4, #3

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Chap4_3
{

	public static void main(String[] args)
	{
		
		int integer;
		
		char answer;
		
		String str, str2;
		
		integer = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer between 0 and 35:"));
		
		if (integer <= 9)
		{
			str = "The number you entered is: " + integer;
			JOptionPane.showMessageDialog(null, str, "Output", JOptionPane.INFORMATION_MESSAGE);
		}
		else
			if (integer >= 10 && integer <= 35)
			{
				answer = (char)(integer + 55);
				str2 = "The character for the integer you entered is: " + answer;
				JOptionPane.showMessageDialog(null, str2, "Output", JOptionPane.INFORMATION_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "The integer you entered is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
				
	}//end method main

}//end class Chap4_3