// Zachary Price
//Chapter 9, #4

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Chap9_4
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("Chap9_4Data.txt"));
		
		int i = 0, testScore;
		int[] range = {24, 49, 74, 99, 124, 149, 174, 200};
		int[] counter = new int[8];
		
		while(inFile.hasNext())
		{
			i = 0;
			testScore = inFile.nextInt();
			while(testScore > range[i])
			i++;
			counter[i]++;
		}//end while
		
		System.out.println("Range [0 - 24] = " + counter[0]);
		
		for (i = 1; i < 8; i++)
			System.out.println("Range [" + (range[i - 1] + 1) + " - " + range[i] + "] = " + counter[i]);
			
	}//end method main
}//end class Chap9_4