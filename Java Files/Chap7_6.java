// Zachary Price
//Chapter 7, #6

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Chap7_6
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[]args)
	{
		int reversedNum;
		
		System.out.println("Please enter an integer to be reversed: ");
		
		reversedNum = console.nextInt();
		
		System.out.println("The integer reversed is: " + reverseDigit(reversedNum));
		
	}//end method main
	
	public static int reverseDigit(int reversedNum)
	{
		String str = "", initialNumStr = "" + reversedNum;
		int initialNum, i;
		
		for(i = initialNumStr.length() - 1; i >= 0; i--)
		{
			str = str + initialNumStr.charAt(i);
			
		}//end for
		return Integer.parseInt(str);
	
	}//end method reverseDigit
}//end class Chap7_6