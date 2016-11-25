/*
Zachary Price
Chapter 2, #10
Program calculates how many miles one can travel on a full tank of gas before having to refuel.
*/

import java.util.*;

public class MilesPerGallon
{

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int gal, mpg, total;
		
		System.out.print("Please enter how many gallons your fuel tank can hold: ");
		
		gal = console.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter the miles per gallon: ");
		
		mpg = console.nextInt();
		
		System.out.println();
		
		total = gal * mpg;
		
		System.out.print("The vehicle can be driven " + total + " miles before needing refueled.");
		
	}// end method main
	
}// end class MilesPerGallon