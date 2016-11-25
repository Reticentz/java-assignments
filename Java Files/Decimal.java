import java.util.*;

public class Decimal
{

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		double num1, num2, num3, num4, num5, sum;
		
		System.out.print("Please enter five floating point numbers : ");
		
		num1 = keyboard.nextDouble();
		
		num2 = keyboard.nextDouble();
		
		num3 = keyboard.nextDouble();
		
		num4 = keyboard.nextDouble();
		
		num5 = keyboard.nextDouble();
		
		sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.println("The rounded sum is: " + (int)(sum + .5));
		
	}//end method main
	
}//end class Decimal