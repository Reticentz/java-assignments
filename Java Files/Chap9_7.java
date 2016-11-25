// Zachary Price
//Chapter 9, #7

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Chap9_7
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("Chap9_7Data.txt"));
		PrintWriter outFile = new PrintWriter("Chap9_7Output.txt");
		
		int winnerCount = 0, i = 0;
		double total = 0;
		String winner = "";
		
		String[] name = new String[5];
		int[] votes = new int[5];
		
		while(inFile.hasNext())
		{
			name[i] = inFile.next();
			votes[i] = inFile.nextInt();
			
			if(votes[i] > winnerCount)
			{
				winnerCount = votes[i];
				winner = name[i];
			}//end if
				
			total = total + votes[i];	
			i++;
		}//end while
		
		outFile.printf("%-20s%-20s%-20s\n", "Candidate", "Votes Received", "% of Total Votes");
		for (i = 0; i < 5; i++)
		outFile.printf("%-20s%-20d%-20.2f\n", name[i], votes[i], (votes[i] / total) * 100);
		outFile.printf("%-20s%-20.0f\n", "Total", total);
		outFile.printf("%-20s%s.\n", "The Winner of the Election is ", winner);
		outFile.close();
	}//end method main
}//end class Chap9_7