//Zachary Price
//Chapter 2, #13

import java.util.*;

public class Chap2_13
{
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		double price, taxRate, percentIncrease, newPrice, salesTax, total, round;
		
		int pennies, penniesNew;
		
		System.out.print("Please enter the original price: ");
		
		price = console.nextDouble();
		
		System.out.println();
		
		System.out.print("Please enter the percentage of the marked up price: ");
		
		percentIncrease = console.nextDouble();
		
		System.out.println();
		
		System.out.print("Please enter the sales tax rate percentage: ");
		
		taxRate = console.nextDouble();
		
		System.out.println();
		
		percentIncrease = percentIncrease / 100;
		
		taxRate = taxRate / 100;
		
		pennies = (int)(price * 100);
		
		penniesNew = (int)(pennies * percentIncrease + pennies);
		
		salesTax = penniesNew * taxRate * .01;
		
		newPrice = penniesNew * .01;
		
		total = newPrice + salesTax;
		
		System.out.printf("Original Price: $%.2f%n\n", price);
		
		System.out.println("Percent Marked Up: " + (percentIncrease * 100) + "%\n");
		
		System.out.printf("New Price: $%.2f%n\n", newPrice);
		
		System.out.println("Sales Tax Rate: " + (taxRate * 100) + "%\n");
		
		System.out.printf("Sales Tax: $%.2f%n\n", salesTax);
		
		System.out.printf("Total: $%.2f", total);
		
	}//end method main
	
}//end class Chap2_13