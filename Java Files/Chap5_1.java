// Zachary Price
//Chapter 5, #1

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Chap5_1
{

	public static void main(String[]args)
	{
		Scanner console = new Scanner(System.in);
		
		String number, digit;
		
		int i, num, sum = 0;
		
		System.out.print("Please enter an integer: ");
		
		number = console.next();
		
		System.out.print("The digits are: ");
		
		for (i = 0; i < number.length();)
		{
			digit = number.substring(i, i + 1);
			num = Integer.parseInt(digit);
			System.out.print(num + " ");
			i++;
			sum = sum + num;
		}
		
		System.out.println("\nThe sum of the digits is: " + sum);
		
	}//end main method
}//end class Chap5_1