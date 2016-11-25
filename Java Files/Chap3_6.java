// Zachary Price
//Chapter 3, #6

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Chap3_6
{

	public static void main(String[] args) throws FileNotFoundException
	{
	
		PrintWriter outFile = new PrintWriter("Chap3_6Output.txt");
	
		final double FED_TAX = .15, STATE_TAX = .035, SS_TAX = .0575, MEDI_TAX = .0275, 
		PENSION = .05, HEALTH_INSURANCE = 75.0;
		
		double amount, gross, round, fed, state, ss, medi, pension;
		
		String name;
		
		name = JOptionPane.showInputDialog("Please enter the name of the employee:");
		
		gross = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount:"));
		
		fed = FED_TAX * gross;
		
		state = STATE_TAX * gross;
		
		ss = SS_TAX * gross;
		
		medi = MEDI_TAX * gross;
		
		pension = PENSION * gross;
		
		amount = gross - (FED_TAX * gross) - (STATE_TAX * gross) - (SS_TAX * gross) - (MEDI_TAX * gross) 
		- (PENSION * gross) - HEALTH_INSURANCE;
		
		outFile.printf("%s%n" + 
		"%-25s$ %8.2f%n" + 
		"%-25s$ %8.2f%n" + 
		"%-25s$ %8.2f%n" + 
		"%-25s$ %8.2f%n" + 
		"%-25s$ %8.2f%n" + 
		"%-25s$ %8.2f%n" + 
		"%-25s$ %8.2f%n" + 
		"%-25s$ %8.2f%n", name, "Gross Amount:", gross, "Federal Tax:", fed, "State Tax:", state, 
		"Social Security Tax:", ss, "Medicare/Medicaid Tax:", medi, "Pension Plan:", pension, 
		"Health Insurance:", HEALTH_INSURANCE, "Net Pay:", amount);
		
		outFile.close();
		
	}//end method main

}//end class Chap3_6