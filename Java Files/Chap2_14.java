//Zachary Price
//Chapter 2, #14

import java.util.*;

public class Chap2_14
{
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		final double LITERS_PER_CARTON = 3.78;
		
		final double COST_LITER = 0.38;
		
		final double PROFIT = 0.27;
		
		double amount, cartons;
		
		System.out.print("Please enter the liters of milk produced: ");
		
		amount = console.nextDouble();
		
		cartons = amount / LITERS_PER_CARTON;
		
		System.out.printf("The number of cartons needed is: %.0f%n", cartons);
				
		System.out.printf("The cost of production is: $%.2f%n", (amount * COST_LITER));
		
		System.out.printf("The profit of production is: $%.2f", (PROFIT * cartons));
		
	}//end method main
	
}//end class Chap2_14