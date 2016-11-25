// Zachary Price
//Chapter 4, #6

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Chap4_6
{

	public static void main(String[] args)
	{
		
		double side1, side2, side3;
		
		side1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the first side:"));
		side1 = Math.pow(side1, 2);
		
		side2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the second side:"));
		side2 = Math.pow(side2, 2);
		
		side3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the third side:"));
		side3 = Math.pow(side3, 2);
		
		if ((side1 == side2 + side3) || (side2 == side1 + side3) || (side3 == side1 + side2))
			JOptionPane.showMessageDialog(null, "The triangle is a right triangle.", "Output", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "The triangle is not a right triangle.", "Output", JOptionPane.INFORMATION_MESSAGE);
		
	}//end method main

}//end class Chap4_6