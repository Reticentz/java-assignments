// Zachary Price
//Chapter 5, #6

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Chap5_6
{

	public static void main(String[]args)
	{
		Scanner console = new Scanner(System.in);
			
		int evenSum = 0, oddSum = 0, num;
		
		System.out.println("Please enter a set of integers, seperated by spaces: (Press CTRL + Z when all integers are entered.)");
		
		while (console.hasNextInt())
		{
			num = console.nextInt();
		
			if (num % 2 == 0)
		
				evenSum = num + evenSum;
			
			else
			
				oddSum = num + oddSum;
		}//end while
		System.out.println("The sum of the even integers is: " + evenSum + "\nThe sum of the odd integers is: " + oddSum);
		
	}//end main method
}//end class Chap5_6