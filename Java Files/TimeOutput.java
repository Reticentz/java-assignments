/*
Zachary Price
Chapter 2, #11
Program translates seconds into a readable time format.
*/

import java.util.*;

public class TimeOutput
{

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
	
		int sec, min, hour;
	
		System.out.print("Please enter the amount of seconds: ");
	
		sec = console.nextInt();
	
		System.out.println();
	
		min = sec / 60;
	
		hour = min / 60;
	
		min = min % 60;
	
		sec = sec % 60;
	
		System.out.print(hour + ":" + min + ":" + sec);
	
	}// end method main
	
}// end class TimeOutput