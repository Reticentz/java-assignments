// Zachary Price
//Chapter 7, #2

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Chap7_2
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[]args)
	{
		int vowel = 0, i;
		String characterStr;
		char character, ch;
		
		System.out.print("Please enter a sequence of characters: ");
		
		characterStr = console.next();

		for(i = 0; i < characterStr.length(); i++)
		{
			character = characterStr.charAt(i);
			
			if (isVowel(character))
				vowel++;
		}//end for
		
		System.out.print("The number of vowels is: " + vowel);
	}//end method main
	
	public static boolean isVowel(char character)
	{
		switch (character)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			return true;	
		}//end switch
		
		return false;
	}//end method isVowel
}//end class Chap7_2