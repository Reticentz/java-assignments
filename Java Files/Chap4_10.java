// Zachary Price
//Chapter 4, #10

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Chap4_10
{

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{
		String str, operatorStr;
		
		char operator;
		
		double num1, num2, answer;
		
		System.out.print("Please enter the equation to be calculated, separated by spaces:");
		
		num1 = console.nextDouble();
		
		operatorStr = console.next();
		
		operator = operatorStr.charAt(0);
		
		num2 = console.nextDouble();
		
		switch (operator)
		{
		case '+':
			answer = num1 + num2;
			str = String.format("%.2f %c %.2f = %.2f", num1, operator, num2, answer);
			JOptionPane.showMessageDialog(null, str, "Results", JOptionPane.PLAIN_MESSAGE);
			break;
		
		case '-':
			answer = num1 - num2;
			str = String.format("%.2f %c %.2f = %.2f", num1, operator, num2, answer);
			JOptionPane.showMessageDialog(null, str, "Results", JOptionPane.PLAIN_MESSAGE);
			break;
			
		case '*':
			answer = num1 * num2;
			str = String.format("%.2f %c %.2f = %.2f", num1, operator, num2, answer);
			JOptionPane.showMessageDialog(null, str, "Results", JOptionPane.PLAIN_MESSAGE);
			break;
			
		case '/':
			if (num2 == 0)
				JOptionPane.showMessageDialog(null, "The denominator cannot be 0.", "Error", JOptionPane.PLAIN_MESSAGE);
			else
			{
				answer = num1 / num2;
				str = String.format("%.2f %c %.2f = %.2f", num1, operator, num2, answer);
				JOptionPane.showMessageDialog(null, str, "Results", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "The operator is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
		}//end switch
		
	}//end method main

}//end class Chap4_10