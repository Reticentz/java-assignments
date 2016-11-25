//Zachary Price
//Chapter 3, #5

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Chap3_5
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
	
		double price1, price2, price3, price4, box, sideline, premium, general, totalTickets, total;
		
		String str1, str2;
		
		Scanner inFile = new Scanner(new FileReader("Chap3_5Data.txt"));
		
		PrintWriter outFile = new PrintWriter("Chap3_5Output.txt");
		
		price1 = inFile.nextDouble();
		
		box = inFile.nextDouble();
		
		price2 = inFile.nextDouble();
		
		sideline = inFile.nextDouble();
		
		price3 = inFile.nextDouble();
		
		premium = inFile.nextDouble();
		
		price4 = inFile.nextDouble();
		
		general = inFile.nextDouble();
		
		totalTickets = (box + sideline + premium + general);
		
		total = (box * price1) + (sideline * price2) + (premium * price3) + (general * price4);
		
		str1 = "The number of tickets sold is:";
		
		str2 = "The total sale amount is:";
		
		outFile.printf("%-34s%-38.0f%n", str1, totalTickets);
		
		outFile.printf("%-34s$%-38.2f", str2, total);
		
		inFile.close();
		
		outFile.close();
		
	}//end method main
	
}//end class Chap3_5