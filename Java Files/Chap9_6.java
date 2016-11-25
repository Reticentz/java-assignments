// Zachary Price
//Chapter 9, #6

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Chap9_6
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("Chap9_6Data.txt"));
		String testScoreStr, studentStr;
		int i = 9, x, scoreCount = 0;
		char space, grade = ' ' ;
		
		testScoreStr = inFile.nextLine();
		space = (char)(32);
		
		System.out.print("Correct Answers: " + testScoreStr);
		
		while (inFile.hasNextLine())
		{
		
			studentStr = inFile.nextLine();
		
			for (x = 0; x <= 19; x++)
			{
				if (testScoreStr.charAt(x) == studentStr.charAt(i))
				{
					scoreCount = scoreCount + 2;
				}//end while
				i++;
			
			}//end for
		
			i = 9;
		
			for (x = 0; x <= 19; x++)
			{
				if (testScoreStr.charAt(x) != studentStr.charAt(i))
				{
					scoreCount = scoreCount - 1;
				}//end while
				i++;
			
			}//end for
		
			i = 9;
		
			for (x = 0; x <= 19; x++)
			{
				if (studentStr.charAt(i) == space)
				{
					scoreCount = scoreCount + 1;
				}//end while
				i++;
			
			}//end for
			
			if ((scoreCount / 40) >= 0.9)
				grade = 'A';
			
			else
				if (((scoreCount / 40) >= 0.8) && ((scoreCount / 40) <= 0.899))
					grade = 'B';
				
				else
					if (((scoreCount / 40) >= 0.7) && ((scoreCount / 40) <= 0.799))
						grade = 'C';
					
					else
						if (((scoreCount / 40) >= 0.6) && ((scoreCount / 40) <= 0.699))
							grade = 'D';
						
						else
							if (((scoreCount / 40) <= 0.599))
								grade = 'F';
							
							else
								System.out.print("Error: Score count out of range.");
							
			System.out.print("\n\nStudent ID: " + studentStr.substring(0,7));
			System.out.print("\nStudent Answers: " + studentStr.substring(9,28));
			System.out.print("\nGrade: " + grade);
	
		}//end while
		inFile.close();
	}//end method main
}//end class Chap9_6