// Zachary Price
//Chapter 4, #12

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Chap4_12
{

	public static void main(String[]args) throws FileNotFoundException
	{
		int accountNum;
		double minimumBal, currentBal, newBal = 0;
		char accountType;
		String accountTypeStr, str;

		Scanner inFile = new Scanner(new FileReader("Chap4_12Data.txt"));
		PrintWriter outFile = new PrintWriter("Chap4_12Output.txt");
		
		do
		{
		accountNum = inFile.nextInt();
		
		accountTypeStr = inFile.next();
		accountType = accountTypeStr.charAt(0);
		
		minimumBal = inFile.nextDouble();
		
		currentBal = inFile.nextDouble();
		
		if (currentBal < minimumBal)
		
			if (accountType == 'S')
			{
				newBal = currentBal - 10;
			}
			else
				if (accountType == 'C')
				{
					newBal = currentBal - 25;
				}
				else
					JOptionPane.showMessageDialog(null, "Invalid account type.", "Error", JOptionPane.PLAIN_MESSAGE);
		else
			if (accountType == 'S')
			{
				newBal = ((currentBal * .04) / 12) + currentBal;
			}
			else
				if (accountType == 'C')
				
					if (currentBal > (minimumBal + 5000))
					{
						newBal = ((currentBal * .05) / 12) + currentBal;
					}
					else
					{
						newBal = ((currentBal * .03) / 12) + currentBal;
					}	
				else
					JOptionPane.showMessageDialog(null, "Invalid account type.", "Error", JOptionPane.PLAIN_MESSAGE);

		outFile.printf(
		"%-23s %13d%n" + 
		"%-23s %13c%n" + 
		"%-23s$%13.2f%n" + 
		"%-23s$%13.2f%n%n", "Account Number:", accountNum, "Account Type:", accountType, "Current Balance:", currentBal, "New Balance:", newBal);
		}
		while (inFile.hasNext());
		
		inFile.close();
		outFile.close();
		System.exit(0);
	}//end main method
}//end class Chap4_12