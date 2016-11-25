/*
Zachary Price
Chapter 2, #12
Program translates readable time format into seconds.
*/

import java.util.*;

public class TimeInput
{
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
	
		int sec, min, hour, total;
		
		System.out.print("Please enter the hour(s): ");
		
		hour = console.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter the minute(s): ");
		
		min = console.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter the second(s): ");
		
		sec = console.nextInt();
		
		System.out.println();
		
		hour = hour * 3600;
		
		min = min * 60;
		
		total = hour + min + sec;
		
		System.out.print("The amount of time in seconds is: " + total);
		
	}//end method main
	
}//end class TimeInput